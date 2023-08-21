package com.example.demo;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.List;

@Path("/singer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
@ApplicationScoped
public class SingerController {
    @Inject
    SingerRepository rep;
    @POST
    public Response create(Singer p) throws SQLException {
         rep.save(p);

        return Response.status(Response.Status.CREATED)
                .entity("singer creado exitosamente")
                .build();
    }
    @GET
    public List<Singer> findAll() {
        return rep.findAll();
    }



}
