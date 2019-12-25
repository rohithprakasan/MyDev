package com.knowledgefactory.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.knowledgefactory.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	
	@Query(
			  value = "SELECT * FROM User", 
			  nativeQuery = true)
			ArrayList<User> findAllActiveUsersNative();
	
}
