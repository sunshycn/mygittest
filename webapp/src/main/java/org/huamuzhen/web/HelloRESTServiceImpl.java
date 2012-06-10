package org.huamuzhen.web;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

@Service("helloRESTService")
public class HelloRESTServiceImpl implements HelloRESTService{
	
	@GET
	@Produces("text/plain")
	@Path("/")
	public String sayHello(){
		DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
		return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
		
	}

}
