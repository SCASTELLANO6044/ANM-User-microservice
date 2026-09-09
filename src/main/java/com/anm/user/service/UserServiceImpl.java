package com.anm.user.service;


import com.anm.user.dto.response.UserResponseDTO;
import com.anm.user.entity.UserEntity;
import com.anm.user.repository.UserRepository;
import com.anm.user.util.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mappers mappers;

    @Override
    public UserResponseDTO findById(int anmId) {
        UserEntity userEntity = userRepository.findById(anmId);
        return mappers.map(userEntity, UserResponseDTO.class);
    }
}
