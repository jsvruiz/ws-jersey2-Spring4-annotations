
package com.underdog.jersey.spring.impl.config;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ws.filter.RandomHeaderFilter;
import com.ws.filter.ValidationExceptionMapper;
import com.ws.rest.UserRest;

@ApplicationPath("/rest")
public class AppConfigJersey extends ResourceConfig {

    public AppConfigJersey(@Context ServletContext context) {
        WebApplicationContext appCtx = WebApplicationContextUtils.getWebApplicationContext(context);
        
        register(appCtx.getBean(RandomHeaderFilter.class));
        register(appCtx.getBean(ValidationExceptionMapper.class));
        register(appCtx.getBean(UserRest.class));
        
    }

}
