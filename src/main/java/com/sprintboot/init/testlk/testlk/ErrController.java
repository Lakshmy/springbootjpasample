package com.sprintboot.init.testlk.testlk;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrController implements ErrorController{

	private static final String PATH = "/error";
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@GetMapping(value=PATH)
	public String defaultErrorMessage() {
		return "Requested resource not found";
	}
	
}
