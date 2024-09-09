package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.Usermodel;
@Service
public class UserserviceImpl implements UserService
{

	@Autowired
	private UserDao dao;
	
	@Override
	public List<Usermodel> getuser() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Usermodel adduser(Usermodel user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public Usermodel updatuser(Usermodel user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		
		Usermodel user = dao.getOne(id);
		
		dao.delete(user);
		
		
	}
	
}
