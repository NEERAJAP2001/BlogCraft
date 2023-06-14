package com.social.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
