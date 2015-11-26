package com.my3w.yuxh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my3w.yuxh.entry.User;
import com.my3w.yuxh.service.UserService;
import com.my3w.yuxh.service.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public User getUserById(int userId) {
		return this.userDao.getUserById(userId);
	}

}
