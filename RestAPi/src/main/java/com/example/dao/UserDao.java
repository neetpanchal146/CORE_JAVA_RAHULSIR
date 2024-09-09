package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Usermodel;

@Repository
public interface UserDao extends JpaRepository<Usermodel, Integer>
{
	
}
