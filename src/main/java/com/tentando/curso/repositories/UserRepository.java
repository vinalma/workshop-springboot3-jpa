package com.tentando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tentando.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
