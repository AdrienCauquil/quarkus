package com.worldline;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @GET
    @Path("/anniversaire/{prenom}/{age}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String anniversaire(@PathParam("prenom")String prenom, @PathParam ("age") String age) {

        return "Bon Anniversaire " + prenom + " pour tes " + age + " ans !";
    }
}
