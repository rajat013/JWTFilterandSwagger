package com.stackroute.auth.service;

import com.stackroute.auth.model.User;

public interface UserInter {

	User saveUser(User obj);
	boolean loginUser(String uname,String password);
}
