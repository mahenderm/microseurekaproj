package com.newt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;

@RestController
@RequestMapping("/shoppingcart")
public class CartController {
	String message = "list of all products in cart"
			+ "I)Nokia===="     
			+ "II)SamSung===="      
			+ "III)Lenovo===";
	@RequestMapping(method=RequestMethod.GET,value="/cart/items",produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ResponseEntity<Response> home(){
		 
		Response response = new Response();
		if(message != null) {
			response.setContent(message);
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}
		else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
		
		
		
	}


