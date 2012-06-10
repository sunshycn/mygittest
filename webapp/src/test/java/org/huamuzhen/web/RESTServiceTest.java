package org.huamuzhen.web;

import javax.ws.rs.core.Response;

import org.apache.cxf.binding.BindingFactoryManager;
import org.apache.cxf.jaxrs.JAXRSBindingFactory;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.testng.annotations.Test;

public class RESTServiceTest {
	
	@Test
	public void test(){
		WebClient client = WebClient.create("http://localhost:8080/huamuzhen/rest/hello");
		Response data = client.path("/").type("text/plain").accept("text/plain").get();
		
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

}
