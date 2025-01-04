package com.spring_orm.in.repositories;

import com.spring_orm.in.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
