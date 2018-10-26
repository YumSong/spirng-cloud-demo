package com.sixdu.client.user.dao;

import com.sixdu.client.user.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDao {
    private static Map<String,UserEntity> userMap;

    static {
        userMap = new HashMap<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("Tony");
        userEntity.setPassword("123456");
        userMap.put(userEntity.getUsername(),userEntity);
    }

    public UserEntity getUserEntity(){
        return userMap.values().iterator().next();
    }
}
