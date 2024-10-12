package com.ghouse.socialraven.service;

import com.ghouse.socialraven.dto.UserPlatformDetails;
import com.ghouse.socialraven.entity.UserPlatform;
import com.ghouse.socialraven.repo.UserPlatformRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPlatformServiceImpl implements UserPlatformService {

	Logger log = LoggerFactory.getLogger(UserPlatformServiceImpl.class);

	@Autowired
	private UserPlatformRepo userPlatformRepo;


	@Override
	public List<UserPlatform> getUserPlatformsByUserId(String userId) {
		return userPlatformRepo.findByUserId(userId);
	}
}
