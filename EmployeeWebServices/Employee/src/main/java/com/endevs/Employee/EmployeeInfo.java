package com.endevs.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myEmployee")
public class EmployeeInfo {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEmployeeDetails() {
		
		return "Hello Employee";
	}
	
}
