package com.newt.DemoController;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.cloud.client.ServiceInstance;
	import org.springframework.cloud.client.discovery.DiscoveryClient;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.client.RestTemplate;

	@RestController
	public class DemoController {

		@Autowired
		private DiscoveryClient discoveryClient;

		@RequestMapping(method = RequestMethod.GET, value = "/home")
		public String greet() {

			return "hello world!!!";
		}

		@RequestMapping(method = RequestMethod.GET, value = "/products")
		public String getProducts() {

			List<ServiceInstance> instances = discoveryClient.getInstances("product-service");
			ServiceInstance serviceInstance = instances.get(0);

			String baseUrl = serviceInstance.getUri().toString();

			baseUrl = baseUrl + "/products";

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = null;
			try {
				response = restTemplate.getForEntity(baseUrl, String.class);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			return response.getBody().toString();

		}
		
		@RequestMapping(method = RequestMethod.GET, value = "/cart/items")
		public String getCartItems() {

			List<ServiceInstance> instances = discoveryClient.getInstances("cart-service");
			ServiceInstance serviceInstance = instances.get(0);

			String baseUrl = serviceInstance.getUri().toString();

			baseUrl = baseUrl + "/cart/items";

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = null;
			try {
				response = restTemplate.getForEntity(baseUrl, String.class);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			return response.getBody().toString();

		}
		
		@RequestMapping(method=RequestMethod.GET,value="/service-instance/{serviceName}")
		public List<ServiceInstance> getServiceInstance(@PathVariable String serviceName){
			
			return discoveryClient.getInstances(serviceName);
		}

	}


