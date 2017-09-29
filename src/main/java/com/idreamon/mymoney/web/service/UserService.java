package com.idreamon.mymoney.web.service;

import com.idreamon.mymoney.web.model.User;

public interface UserService {
	User findUserByEmail(String email);
	void saveUser(User user);
}
