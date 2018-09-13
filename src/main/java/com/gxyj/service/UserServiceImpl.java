package com.gxyj.service;

import com.gxyj.dao.TUserMapper;
import com.gxyj.model.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TUserMapper userMapper;

    @Override
    public TUser getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(TUser record) {
        boolean result = false;
        try {
            userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
