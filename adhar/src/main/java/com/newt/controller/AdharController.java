package com.newt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.pojo.Adhar;
import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;


@RestController
@RequestMapping("/adhar")
public class AdharController {
	String message = "Well come to my world...";
	//String message = null;
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	
	public ResponseEntity<Response> adhar(){
		
		Adhar adhar = new Adhar();
		adhar.setaId(111111);
		adhar.setaName("Remo");
		adhar.setAage(23);
		
		 
		Response response = new Response();
		if(message != null) {
			response.setContent(adhar);
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}
		else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		
		
	}

}
