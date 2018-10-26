package com.sixdu.client.user.assemble;

import com.sixdu.client.user.model.UserDto;
import com.sixdu.client.user.model.UserEntity;

public class UserAssemble {
    public static UserDto userEntity2UserDto(UserEntity entity){
        UserDto userDto = new UserDto();
        userDto.setId(entity.getId());
        userDto.setUsername(entity.getUsername());
        userDto.setPassword(entity.getPassword());
        return userDto;
    }
}
