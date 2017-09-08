package com.mad.subscription.service.controller;

import java.io.File;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.commons.io.FileUtils;

@Path("/subscription")
public class SubscriptionController {
	 
	@GET
	@Path("/{clientId}")
	public Response getClientId(@PathParam("clientId") String name) {
		String output = "Welcome   : " + name;
		try {
			FileUtils.writeStringToFile(new File("\\var\\subscription.txt"), name, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return Response.status(200).entity(output).build();
	}

}
