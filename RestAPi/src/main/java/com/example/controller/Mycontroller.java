	package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Usermodel;
import com.example.service.UserService;

@RestController
public class Mycontroller 
{	
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/get")
	public List<Usermodel> getusr()
	{
		return this.service.getuser();
	}
	
	
	@PostMapping("/add")
	public Usermodel adduser(@RequestBody Usermodel user)
	{
		return this.service.adduser(user);
	}
	
	
	@PutMapping("/update")
	public Usermodel updateuser(@RequestBody Usermodel user)
	{
		return this.service.updatuser(user);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<HttpStatus> deletteuser(@PathVariable String id)
	{
		try {
			
			this.service.deleteuser(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
}
