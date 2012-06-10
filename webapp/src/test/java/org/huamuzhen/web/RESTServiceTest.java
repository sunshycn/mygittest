package org.huamuzhen.web;

import org.apache.cxf.jaxrs.client.WebClient;
import org.huamuzhen.dto.ErrorDTO;
import org.testng.annotations.Test;

public class RESTServiceTest {
	
	@Test
	public void test(){
		WebClient client = WebClient.create("http://localhost:8080/huamuzhen/rest/hello");
	/*	String data = client.path("rest/hello").type("text/plain").accept("text/plain").get(String.class);
		
		JAXRSClientFactoryBean sf = new JAXRSClientFactoryBean();
		sf.setResourceClass(HelloRESTService.class);
		sf.setAddress("http://localhost:8080/huamuzhen/rest/");
		BindingFactoryManager manager = sf.getBus().getExtension(BindingFactoryManager.class);
		JAXRSBindingFactory factory = new JAXRSBindingFactory();
		factory.setBus(sf.getBus());
		manager.registerBindingFactory(JAXRSBindingFactory.JAXRS_BINDING_ID, factory);
		HelloRESTService service = sf.create(HelloRESTService.class);
		WebClient wc = sf.createWebClient();
		Response data = wc.path("/hello").accept("text/plain").get();
		System.out.println(data.getStatus());
		System.out.println(data.getEntity().toString());
		System.out.println(data);*/
		
/*		Response data2 = client.path("rest/hello").type("text/plain").accept("text/plain").get();
		System.out.println(data2.getClass());
		System.out.println(data2.getEntity());
		System.out.println();*/
		
		ErrorDTO data1 = client.path("update").type("application/json").invoke("PUT",null,ErrorDTO.class);
		System.out.println(data1.getCode());
		System.out.println(data1.getStatus());

	}

}
