package com.altice.aplication;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@ApplicationPath("/")
@OpenAPIDefinition(
	 
	    info = @Info(
	        title="Altice API",
	        version = "1.0",
	        contact = @Contact(
	            name = "Example API Support",
	            url = "http://exampleurl.com/contact",
	            email = "raylson11@gmail.com"))
)
public class AlticeAplicattion extends Application {

}
