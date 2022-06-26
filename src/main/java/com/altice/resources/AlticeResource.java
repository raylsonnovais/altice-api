package com.altice.resources;

import com.altice.services.AlticeService;
import com.google.gson.Gson;

import org.jboss.resteasy.annotations.jaxrs.PathParam;



import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAllsequenciaAlticci(@PathParam("n") Integer n){
    	String json = new Gson().toJson(service.allSequenceAltice(n));
        return  Response.ok(json).build();
    }
    
    
}
