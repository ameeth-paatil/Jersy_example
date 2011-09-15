package com.ameeth.jersey.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ameeth.jersey.service.GreetingService;

/**
 * <p>
 * GreetingsResource
 * </p>
 * @version 1.0
 * @author Ameeth Paatil
 * @since Sep 13, 2011
 */
@Path("/greeting")
@Component
@Scope("request")
public class GreetingsResource {

    @Autowired
    private GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return service.sayHello();
    }
}
