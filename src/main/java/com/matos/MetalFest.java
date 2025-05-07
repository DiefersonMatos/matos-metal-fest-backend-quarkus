package com.matos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/festival")
public class MetalFest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello WORLD Matos Metal Fetival Was Born to Go to Dublin";
    }
}
