package org.huamuzhen.web;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/hello")
public interface HelloRESTService {
	
	@GET
	@Produces("text/plain")
	@Path("/")
	public String sayHello();

}
