package com.anm.user.service;

import com.anm.user.dto.response.UserResponseDTO;


public interface UserService {
    UserResponseDTO findById(int anmId);
}
