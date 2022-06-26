package com.altice.resources;

import com.altice.services.AlticeService;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/alticci")
public class AlticeResource {

    @Inject
    private AlticeService service;

    public AlticeResource(AlticeService service){
        this.service = service;
    }

    @GET
    @Path("/{n}")
    public Response sequenciaAlticci(@PathParam("n") Integer n){
        return Response.ok(service.sequenciaAltice(n)).build();
    }
    
    @GET
    @Path("all/{n}")
    public List<Response> getAllsequenciaAlticci(@PathParam("n") Integer n){
        return (List<Response>) Response.ok(service.allSequenceAltice(n)).build();
    }
    
    
}
