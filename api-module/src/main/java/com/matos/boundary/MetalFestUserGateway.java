package com.matos.boundary;

import com.matos.entity.UserRequest;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * RESTful API interface for managing user data in the MetalFest system.
 * <p>
 * This interface defines endpoints for user retrieval, creation, and deletion.
 * It consumes and produces JSON-formatted data.
 */
@Path("/user")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public interface MetalFestUserGateway {

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the ID of the user to retrieve
     * @return a {@link Response} containing the user data or an error status
     */
    @GET
    @Path("/{id}")
    Response getUserById(@PathParam("id") String id);

    /**
     * Retrieves a list of all users in the system.
     *
     * @return a {@link Response} containing a list of users
     */
    @GET
    @Path("/all-users")
    Response getAllUsers();

    /**
     * Retrieves the total number of registered users.
     *
     * @return a {@link Response} containing the number of users
     */
    @GET
    @Path("/number-of-users")
    Response getNumberOfUsers();

    /**
     * Creates a new user in the system.
     *
     * @param user the {@link UserRequest} object containing user details
     * @return a {@link Response} indicating the result of the operation
     */
    @POST
    @Path("create-user")
    Response createUser(UserRequest user);

    /**
     * Deletes a user by their unique identifier.
     *
     * @param id the ID of the user to delete
     * @return a {@link Response} indicating the result of the deletion
     */
    @DELETE
    @Path("/delete/{id}")
    Response deleteUser(@PathParam("id") String id);
}
