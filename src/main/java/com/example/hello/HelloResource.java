package com.example.hello;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("")
public class HelloResource {

    @Inject
    HelloUsecase usecase;

    @Path("{name}")
    @GET
    public Response hello(@PathParam("name") @DefaultValue("world") final String name) {
        return Response.ok(usecase.hello(name)).build();
    }

}
