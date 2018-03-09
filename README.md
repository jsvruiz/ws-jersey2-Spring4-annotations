# Jersey 2 - CRUD with annotations

Simple code with the basic operations of RESTful Web Services 

we create web services with the help of:

* Jersey 2.23.1
* Spring 4.3.13.RELEASE
* Jackson 2.7.3

### Prerequisites

* [Java 1.8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html/) 
* [Tomcat 8.5.28 ](https://tomcat.apache.org/download-80.cgi#8.5.28/) 
* [Eclipse  Oxygen.2 Release (4.7.2)](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-mac64.tar.gz/) 
* [postman 5.5.3](https://www.getpostman.com/)

## Example code

The Rest methods to implement are very easy, you only need add next annotations :

```
@GET , @POST, @PUT , @DELETE
```

some path if you require it

after, You need indique if you consume for example a JSON and if your response will be a JSON or XML

```

@POST 
@Path("/create")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML })
public Response myMethod(Object o ) {
	
}

```


## Running the tests

inside the directory /ws-jersey-spring-annotations/doc you have the file ws-jersey2-spring4-annotations.postman_collection.postm that will help you with your requests, please open it with postman

Be careful with the port the applications container or server!

Testing endpoints: 

@GET

```
 url : http://localhost:8080/ws-jersey-spring-annotation/rest/user/read
```

Response:

```
{
    "message": "ok",
    "error": false,
    "data": [
        {
            "id": 1,
            "user": "User 1",
            "password": "user1"
        },
        {
            "id": 2,
            "user": "User 2",
            "password": "user2"
        },
        {
            "id": 3,
            "user": "User 3",
            "password": "user3"
        },
        {
            "id": 4,
            "user": "User 4",
            "password": "user4"
        },
        {
            "id": 5,
            "user": "User 5",
            "password": "user5"
        }
    ]
}
```

@POST

```
 URL: http://localhost:8080/ws-jersey-spring-annotation/rest/user/create
 HEADERS: Content-Type: application/json
 BODY RAW:  
		{
			"id" : 99,
			"user" : "Super user",
			"password" : "123"
		}
		
```

Response:

```

{
    "message": "ok",
    "error": false,
    "data": [
        {
            "id": 1,
            "user": "User 1",
            "password": "user1"
        },
        {
            "id": 2,
            "user": "User 2",
            "password": "user2"
        },
        {
            "id": 3,
            "user": "User 3",
            "password": "user3"
        },
        {
            "id": 4,
            "user": "User 4",
            "password": "user4"
        },
        {
            "id": 5,
            "user": "User 5",
            "password": "user5"
        },
        {
            "id": 99,
            "user": "Super user",
            "password": "123"
        }
    ]
}

```


@UPDATE

```
 URL: http://localhost:8080/ws-jersey-spring-annotation/rest/user/update
 HEADERS: Content-Type: application/json
 BODY RAW:  
		{
			"id" : 1,
			"user" : "user updated",
			"password" : "456"
		}
		
```

Response:

```

{
    "message": "ok",
    "error": false,
    "data": [
        {
            "id": 1,
            "user": "User 1",
            "password": "user1"
        },
        {
            "id": 2,
            "user": "User 2",
            "password": "user2"
        },
        {
            "id": 3,
            "user": "User 3",
            "password": "user3"
        },
        {
            "id": 4,
            "user": "User 4",
            "password": "user4"
        },
        {
            "id": 5,
            "user": "User 5",
            "password": "user5"
        },
        {
            "id": 99,
            "user": "Super user",
            "password": "123"
        }
    ]
}

```


@UPDATE

```
 URL: http://localhost:8080/ws-jersey-spring-annotation/rest/user/update
 HEADERS: Content-Type: application/json
 BODY RAW:  
		{
			"id" : 1,
			"user" : "user updated",
			"password" : "456"
		}
		
```

Response:

```

{
    "message": "ok",
    "error": false,
    "data": [
        {
            "id": 1,
            "user": "user updated",
            "password": "456"
        },
        {
            "id": 2,
            "user": "User 2",
            "password": "user2"
        },
        {
            "id": 3,
            "user": "User 3",
            "password": "user3"
        },
        {
            "id": 4,
            "user": "User 4",
            "password": "user4"
        },
        {
            "id": 5,
            "user": "User 5",
            "password": "user5"
        }
    ]
}

```


@DELETE

```
 URL: http://localhost:8080/ws-jersey-spring-annotation/rest/user/delete
 HEADERS: Content-Type: application/json
 BODY RAW:  
		{
			"id" : 2,
			"user" : "user 1",
			"password" : "user1"
		}
		
```

Response:

```

{
    "message": "ok",
    "error": false,
    "data": [
        {
            "id": 1,
            "user": "User 1",
            "password": "user1"
        },
        {
            "id": 3,
            "user": "User 3",
            "password": "user3"
        },
        {
            "id": 4,
            "user": "User 4",
            "password": "user4"
        },
        {
            "id": 5,
            "user": "User 5",
            "password": "user5"
        }
    ]
}

```



## Authors

**Jesus Ruiz** - *Initial work* - [jvzruiz](https://github.com/jvzruiz/)

## Acknowledgments

* All word can use this code
* I only try to help to do web services easy and fast
