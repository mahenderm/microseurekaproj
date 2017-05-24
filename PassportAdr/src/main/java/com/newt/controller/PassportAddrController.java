package com.newt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.pojo.Passport;
import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;

@RequestMapping("/passportaddr")
@RestController
public class PassportAddrController {
	
	String message = "Passport verification Address........";
	@RequestMapping(value = "/address", method = RequestMethod.GET, produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ResponseEntity<Response> pAdr(){
		Response response = new Response();
		
		Passport pp =new Passport();
		
		pp.setPid(001);
		pp.setPname("Roy");
		pp.setPcity("USA");
	
		if(message != null) {
			response.setContent(pp);
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}
		else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
	
	@RequestMapping(value = "/address1", method = RequestMethod.GET, produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ResponseEntity<Response> pAdr1(){
		Response response = new Response();
		
		Passport pp =new Passport();
		
		pp.setPid(002);
		pp.setPname("John");
		pp.setPcity("London");
	
		if(message == null) {
			response.setContent(pp);
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}
		else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		
		
	}

}
