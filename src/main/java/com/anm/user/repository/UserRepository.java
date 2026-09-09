package com.anm.user.repository;


import com.anm.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Integer>{
    UserEntity findById(int id);
}
