package com.api.crud.repository;

import com.api.crud.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserCrudRepository extends JpaRepository<UserEntity, Integer> {
}
