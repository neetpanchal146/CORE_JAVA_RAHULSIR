package com.example.service;

import java.util.List;

import com.example.model.Usermodel;

public interface UserService 
{
	public List<Usermodel> getuser();
	
	public Usermodel adduser(Usermodel user);
	
	public Usermodel updatuser(Usermodel user);
	
	public void deleteuser(int id);
}
