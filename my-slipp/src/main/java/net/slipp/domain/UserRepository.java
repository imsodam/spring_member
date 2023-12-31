package net.slipp.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//Optional<User> findByUserId(String userId);

	User findByUserId(String userId);
}
