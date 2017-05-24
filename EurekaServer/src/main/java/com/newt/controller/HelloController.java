
/*
 * Mahender Muthyala
 */
package com.newt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;


@RestController
@RequestMapping("/server")
public class HelloController {
	String message = "Server Started...";
	//String message = null;

	@RequestMapping(value = "/message", method = RequestMethod.GET, produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	
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
