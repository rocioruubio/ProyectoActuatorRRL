package com.actuator.ProyectoActuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "newEndPoint")
public class PersonalizarEndPoint {
	
	@GetMapping("/new")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Soy Rocio", HttpStatus.OK);
	}

}
