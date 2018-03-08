
package com.underdog.jersey.spring.impl.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        registerContextLoaderListener(servletContext);
        
        // Set the Jersey used property to it won't load a ContextLoaderListener
        servletContext.setInitParameter("contextConfigLocation", "");
    }
    
    private void registerContextLoaderListener(ServletContext servletContext) {
        WebApplicationContext webContext;
        webContext = createWebAplicationContext(AppConfigSpring.class);
        servletContext.addListener(new ContextLoaderListener(webContext));
    }
    
    public WebApplicationContext createWebAplicationContext(Class configClasses) {
        AnnotationConfigWebApplicationContext context;
        context = new AnnotationConfigWebApplicationContext();
        context.getEnvironment().setActiveProfiles("production");
        context.register(configClasses);
//        context.scan(configClasses.getPackage().getName());
        return context;
    }
}
