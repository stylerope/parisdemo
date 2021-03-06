package com.example.demo.handle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value=RuntimeException.class)
	@ResponseBody
	public ResponseEntity handle(RuntimeException e){
		return ResponseEntity.noContent().build();
	}

}
