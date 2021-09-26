package com.project.darbe.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.darbe.model.SubscribeEmail;
import com.project.darbe.model.User;
import com.project.darbe.service.EmailService;
import com.project.darbe.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

@RequestMapping("/api")
public class UnSubscribeEmailController {

	
	@Autowired
	private EmailService emailService;
	
	// @PostMapping("/unsubscribeEmail")
	@DeleteMapping("/unsubscribeEmail")
	public String subscribeEmail(@RequestBody SubscribeEmail emailID) throws IOException{
		System.out.println("In UnSubscribeEmailController class");
		System.out.println("emailID: " +emailID.getEmail());
		emailService.unSunscribeEmail(emailID);
		return null;
	}
	
}
