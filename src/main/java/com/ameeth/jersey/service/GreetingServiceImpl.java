package com.ameeth.jersey.service;

import org.springframework.stereotype.Service;

/**
 * <p>
 * GreetingService
 * </p>
 * @version 1.0
 * @author Ameeth Paatil
 * @since Sep 13, 2011
 */
@Service
public class GreetingServiceImpl
    implements GreetingService {

    /**
     * @see com.ameeth.jersy.service.GreetingService#sayHello()
     */
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
