package com.matos.control;

import com.matos.boundary.MetalFestUserGateway;
import com.matos.entity.UserRequest;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.Response;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the MetalFestUserGateway interface responsible for user-related operations.
 * This class handles requests to get, create, delete users and provides user-related information.
 */
@Log4j2
@RequestScoped
public class MetalFestUserGatewayImplementation implements MetalFestUserGateway {

    /**
     * {@inheritDoc}
     */
    @Override
    public Response getUserById(String id) {

        try {
            // TODO: implement logic to get user by id in service layer.
            final String user = "This string will be replaced for get user by id logic";
            log.info("get user: '{}' with id: '{}'", user, id);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.noContent().build();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response getAllUsers() {
        try {
            // TODO: implement logic to get all users in service layer.
            final List<String> users = new ArrayList<>();
            log.info("get all users : '{}'", users);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.noContent().build();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response getNumberOfUsers() {
        try {
            // TODO: implement logic to get number of users in service layer.
            final String numberOfUsers = "This string will be replaced for get number of users logic";
            log.info("get number of users: '{}'", numberOfUsers);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.noContent().build();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response createUser(final UserRequest user) {
        try {
            // TODO: implement logic to create user in service layer.
            log.info("created user: '{}' with id: '{}'", user, user.getId());
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.noContent().build();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response deleteUser(String id) {
        try {
            // TODO: implement logic to delete user by id in service layer.
            final String user = "This string will be replaced for delete user by id logic";
            log.info("deleted user: '{}' with id: '{}'", user, id);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.noContent().build();
        }
    }
}
