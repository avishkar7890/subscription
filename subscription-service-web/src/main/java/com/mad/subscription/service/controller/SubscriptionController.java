package com.mad.subscription.service.controller;

import java.io.File;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.io.FileUtils;

@Path("/subscription")
public class SubscriptionController {
	 
	@GET
	@Path("/{clientId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getClientId(@PathParam("clientId") String name) {
		try {
			FileUtils.writeStringToFile(new File("\\var\\subscription.txt"), name + "\r\n", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return Response.status(200).entity("OK").build();
	}

}
