package com.gsafety.management.user.hm.service;

import com.gsafety.management.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    User logon(User user);

    User getUserById(Integer id);

    List<User> getUserByAccount(String account);

    List<User> getUsers();
}
