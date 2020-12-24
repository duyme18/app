package com.hdd.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdd.app.common.ERole;
import com.hdd.app.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	/**
	 * Find role by name
	 * 
	 * @param name
	 * @return Role
	 */
	Optional<Role> findByName(ERole name);

}
