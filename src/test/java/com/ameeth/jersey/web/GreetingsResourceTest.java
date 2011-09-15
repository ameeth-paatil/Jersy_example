package com.ameeth.jersey.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import javax.ws.rs.core.MediaType;

import org.testng.annotations.Test;

import com.sun.jersey.api.client.WebResource;

/**
 * This is a TestNG test for GreetingsResource
 * This test was generated at 09/13/2011
 * @author Ameeth Paatil
 */

public class GreetingsResourceTest
    extends JerseyTestNGTest {

    /**
     * @see com.ameeth.jersy.web.GreetingsResource#sayHello
     */
    @Test
    public void sayHello() {
        WebResource resource = resource();
        String greeting = resource.path( "greeting" )
            .accept( MediaType.TEXT_PLAIN )
            .get( String.class );
        assertNotNull( greeting );
        assertEquals( greeting, "Hello World!" );
    } 
}
