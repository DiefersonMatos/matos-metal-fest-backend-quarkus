package com.matos.control;

import com.matos.boundary.MetalFestUserGateway;
import com.matos.entity.UserRequest;
import jakarta.ws.rs.core.Response;


public class MetalFestUserGatewayImplementation implements MetalFestUserGateway {

    @Override
    public Response getUserById(String id) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response getNumberOfUsers() {
        return null;
    }

    @Override
    public Response createUser(UserRequest user) {
        return null;
    }

    @Override
    public Response deleteUser(String id) {
        return null;
    }
}
