package com.springsecond.accessingdatapostgressql;

import org.springframework.data.repository.CrudRepository;

import com.springsecond.accessingdatapostgressql.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
