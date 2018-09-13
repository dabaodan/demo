package com.gxyj.service;

import com.gxyj.model.TUser;

public interface UserService {

    public TUser getUserById(int userId);

    boolean addUser(TUser record);
}
