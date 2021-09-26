package com.project.darbe.controller;

import java.io.IOException;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.project.darbe.model.User;

import com.project.darbe.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/user")
	public String createUser(@RequestBody User user) throws IOException{
		System.out.println("In Controller class");
		userService.saveuser(user);
		return null;
	}
	

}
