package com.anm.user.dto.response;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class UserResponseDTO {

    private String email;
    private String anmUlid;
    private String usersname;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
