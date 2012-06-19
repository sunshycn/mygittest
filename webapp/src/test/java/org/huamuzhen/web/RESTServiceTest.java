package org.huamuzhen.web;

import java.util.Collections;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.ResponseReader;
import org.apache.cxf.jaxrs.client.WebClient;
import org.huamuzhen.dto.ErrorDTO;
import org.testng.annotations.Test;

public class RESTServiceTest {
	ResponseReader reader = new ResponseReader();
	
	
	RESTServiceTest(){
		reader.setEntityClass(String.class);
	}
	
	@Test
	public void test(){
		WebClient client = getWebClient("http://localhost:8080/huamuzhen/rest/");
		Response data = client.path("/hello").type("text/plain").accept("text/plain").get();

		
		/*JAXRSClientFactoryBean sf = new JAXRSClientFactoryBean();
		sf.setResourceClass(HelloRESTService.class);
		sf.setAddress("http://localhost:8080/huamuzhen/rest/");
		BindingFactoryManager manager = sf.getBus().getExtension(BindingFactoryManager.class);
		JAXRSBindingFactory factory = new JAXRSBindingFactory();
		factory.setBus(sf.getBus());
		manager.registerBindingFactory(JAXRSBindingFactory.JAXRS_BINDING_ID, factory);
		HelloRESTService service = sf.create(HelloRESTService.class);
		WebClient wc = sf.createWebClient();
		Response data = wc.path("/hello").accept("text/plain").get();*/
		System.out.println(data.getStatus());
		System.out.println(data.getEntity());

	}
	
	@Test
	public void test2(){
		WebClient client = getWebClient("http://localhost:8080/huamuzhen/rest/");
		Response data = client.path("/hello/say").type("text/plain").accept("text/plain").get();
		System.out.println(data.getStatus());
		System.out.println(data.getEntity());
	}
	
	@Test
	public void test3(){
		/*ResponseReader reader = new ResponseReader(ErrorDTO.class);*/
		reader.setEntityClass(String.class);
		WebClient client = getWebClient("http://localhost:8080/huamuzhen/rest/");
		ErrorDTO data = client.path("/hello/add").type("application/json").accept("application/json").post(null, ErrorDTO.class);
		/*String error = data.getEntity();
		System.out.println(error);*/
	}
	
	
	private WebClient getWebClient(String address){
		return WebClient.create(address,Collections.singletonList(reader));
	}

}
