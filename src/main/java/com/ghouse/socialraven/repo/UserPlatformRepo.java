package com.ghouse.socialraven.repo;

import com.ghouse.socialraven.entity.UserPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPlatformRepo extends JpaRepository<UserPlatform,String> {

	List<UserPlatform> findByUserId(String userId);
}
