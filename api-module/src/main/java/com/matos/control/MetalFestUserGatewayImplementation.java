package com.matos.control;

import com.matos.boundary.MetalFestUserGateway;
import jakarta.ws.rs.core.Response;


public class MetalFestUserGatewayImplementation implements MetalFestUserGateway {

    @Override
    public Response getUserById(final Long id) {
        String helloWorld = "Hello World: " + id;
        System.out.println(helloWorld);
        return Response.ok(helloWorld).build();
    }

}
