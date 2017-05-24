package com.newt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
/*import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;*/

import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;


@RestController
@RequestMapping("/demo")
public class HelloController {
	String message = "Well come to my world...";
/*	  @RequestMapping(value = "/", method = RequestMethod.GET)
	    //public  List<StudentPojo> findByName( )
	    public ResponseEntity<Response> findByResponse() {

	        System.out.println("Getting Student ByName");
	        Response response = new Response();
	        //return Lists.newArrayList(service.findStudentsByName());
	        if (studentsList == null || studentsList.size() == 0) {
	            response.setStatus(StatusCode.E400);
	            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
	        } else {
	            response.setContent(studentsList);
	            response.setStatus(StatusCode.U200);
	            return new ResponseEntity<Response>(response, response.getHttpStatus());
	        }

	    }*/
	
	// @RequestMapping(value = "/", method = RequestMethod.GET)
/*	public ResponseEntity<Response> status(){
		System.out.println("getting status code");
		
		Response response = new Response();
		if(message != null) {
			
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		//return null;
		

		
	}*/
	 @RequestMapping(value = "/", method = RequestMethod.GET )
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
