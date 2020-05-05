package com.stackroute.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.auth.model.User;
import com.stackroute.auth.repo.UserRepo;

@Service
public class UserInterImpl implements UserInter {

	@Autowired
	UserRepo repo;
	
	@Override
	public User saveUser(User obj) {
	User uobj=repo.save(obj);
	return uobj;
	}

	@Override
	public boolean loginUser(String uid, String uname) {
		 User user=repo.findByUseridAndUsername(uid,uname);
		
		 if(user==null)
			 return false;
		 else
		return true;
	}

}
