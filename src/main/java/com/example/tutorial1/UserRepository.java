package com.example.tutorial1;

import org.springframework.data.repository.CrudRepository;
import com.example.tutorial1.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}