package com.matos.boundary;

import com.matos.entity.UserRequest;
import com.matos.entity.UserResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/user")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public interface MetalFestUserGateway {

    @GET
    @Path("/{id}")
    Response getUserById(@PathParam("id") String id);

    @GET
    @Path("/all-users")
    Response getAllUsers();

    @GET
    @Path("/number-of-users")
    Response getNumberOfUsers();

    @POST
    @Path("create-user")
    Response createUser(UserRequest user);

    @DELETE
    @Path("/delete/{id}")
    Response deleteUser(@PathParam("id") String id);
}
