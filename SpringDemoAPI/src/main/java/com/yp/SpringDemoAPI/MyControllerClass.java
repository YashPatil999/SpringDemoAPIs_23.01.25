package com.yp.SpringDemoAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/YashTutorials")
public class MyControllerClass {

	@RequestMapping(value = "/html", method = RequestMethod.GET)
	public String Html() {
		return "Welcome to HTML Tutorials";
	}

	@RequestMapping(value = "/java", method = RequestMethod.POST)
	public String Java() {
		return "Welcome to Java Tutorials";
	}

	@RequestMapping(value = "/dotnet", method = RequestMethod.PUT)
	public String DotNet() {
		return "Welcome to DotNet Tutorials";
	}

	@RequestMapping(value = "/python", method = RequestMethod.DELETE)
	public String Python() {
		return "Welcome to Python Tutorials";
	}

	@RequestMapping(value = "/bigdata", method = RequestMethod.HEAD)
	public String BigData() {
		return "Welcome to BigData Tutorials";
	}

	@RequestMapping(value = "/aiml", method = RequestMethod.OPTIONS)
	public String AIML() {
		return "Welcome to AIML Tutorials";
	}

	@RequestMapping(value = "/sql", method = RequestMethod.PATCH)
	public String SQL() {
		return "Welcome to SQL Tutorials";
	}

	@RequestMapping(value = "/oracle", method = RequestMethod.TRACE)
	public String Oracle() {
		return "Welcome to Oracle Tutorials";
	}

}
