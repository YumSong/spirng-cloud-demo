package com.sixdu.client.user.service.impl;

import com.sixdu.client.user.assemble.UserAssemble;
import com.sixdu.client.user.dao.UserDao;
import com.sixdu.client.user.model.UserDto;
import com.sixdu.client.user.model.UserEntity;
import com.sixdu.client.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDto getUserDto() {
        UserEntity entity = userDao.getUserEntity();
        return UserAssemble.userEntity2UserDto(entity);
    }
}
