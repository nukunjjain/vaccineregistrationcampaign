package com.orlando.vaccineregistrationcampaign.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.vaccineregistrationcampaign.dao.UserDaoImpl;
import com.orlando.vaccineregistrationcampaign.model.User;


@Service
public class UserServiceImpl {
	@Autowired
	UserDaoImpl dao;

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		dao.saveUser(user);
		
	}

	

}
