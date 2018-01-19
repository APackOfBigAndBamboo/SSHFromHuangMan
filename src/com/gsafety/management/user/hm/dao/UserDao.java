package com.gsafety.management.user.hm.dao;

import com.gsafety.management.pojo.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    User logon(User user);

    User getUserById(Integer id);

    List<User> getUserByAccount(String account);

    List<User> getUsers();
}
