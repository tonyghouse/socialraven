package com.ghouse.socialraven.service;

import com.ghouse.socialraven.entity.UserPlatform;

import java.util.List;

public interface UserPlatformService {

	List<UserPlatform> getUserPlatformsByUserId(String userId);
}
