package com.anm.user.controller;

import com.anm.user.dto.request.UserRequestDTO;
import com.anm.user.dto.response.UserResponseDTO;
import com.anm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable String anmId) {
        return new ResponseEntity<>(userService.findById(Integer.parseInt(anmId)), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO){

        UserResponseDTO userResponseDTO = userService.createUser(userRequestDTO);

        return new ResponseEntity<>(userResponseDTO, HttpStatus.CREATED);
    }
}
