package com.cg.spring.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class Hello {
	
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "Hello world!";
    }
    
    @RequestMapping("/message")
public String message1() {
	System.out.println("Your in Spring of localHost");
	return "Your on Internet";
}
    @RequestMapping("/some-other-api")
	public String someOtherApi() {
		System.out.println("someOtherApi");
		return "<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
				+ "    <h1 style='color: blue; font-family: Arial, Helvetica;'>Welcome to Capgemini</h1>\r\n"
				+ "    <p style='color: darkblue; font-family: consolas, Monospace;'>You are most welcome to Capgemini.</p>\r\n"
				+ "    <img src='https://www.capgemini.com/us-en/wp-content/uploads/sites/4/2018/08/cropped-cropped-capgemini_logo_color_rgb.png'>\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>";
    }
}
