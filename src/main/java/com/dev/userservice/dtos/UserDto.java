package com.dev.userservice.dtos;

import com.dev.userservice.models.Role;
import com.dev.userservice.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserDto {
    private String email;
    private Set<Role> roles = new HashSet<>();

    // create a deep copy from existing user object
    public static UserDto from(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        // set other values when required
        return userDto;
    }
}
