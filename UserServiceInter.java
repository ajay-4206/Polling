package com.App.Polling.Service;

import java.util.Optional;

import com.App.Polling.Entity.User;
import com.App.Polling.dto.LoginDto;

public interface UserServiceInter {

	public void saveUser(User user);

	Optional<User> checkUserDetailsByUseridandPassword(LoginDto logindto);

	Optional<User> findByUserid(long userId);
}