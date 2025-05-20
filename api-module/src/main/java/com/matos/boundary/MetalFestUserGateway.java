package com.matos.boundary;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/user")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public interface MetalFestUserGateway {

    @GET
    @Path("/{id}")
    Response getUserById(@PathParam("id") Long id);
}
