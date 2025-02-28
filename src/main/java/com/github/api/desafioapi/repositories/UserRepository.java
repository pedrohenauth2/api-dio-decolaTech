package com.github.api.desafioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.api.desafioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
