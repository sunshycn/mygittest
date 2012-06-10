package org.huamuzhen.web;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.huamuzhen.dto.ErrorDTO;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

@Service("helloRESTService")
@Path("/")
public class HelloRESTServiceImpl implements HelloRESTService{
	
	@GET
	@Produces("text/plain")
	@Path("/")
	public String sayHello(){
		DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
		return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
		
	}
	
	@GET
	@Produces("text/plain")
	@Path("/say")
	public String sayHello2(){
		
		return "hello world";
		
	}
	

    @POST
    @Path("/add")
    @Consumes({ "application/json", "text/json" })
    @Produces({ "application/json", "text/json" })
    public ErrorDTO add(){
    	ErrorDTO error = new ErrorDTO();
    	error.setCode("Error400add");
    	error.setStatus(400);
    	
    	return error;
    	
    }
    
    @PUT
    @Path("/update")
    @Consumes({ "application/json", "text/json" })
    @Produces({ "application/json", "text/json" })
    public ErrorDTO update(){
    	
    	ErrorDTO error = new ErrorDTO();
    	error.setCode("Error401");
    	error.setStatus(401);
    	
    	return error;
    }

}
