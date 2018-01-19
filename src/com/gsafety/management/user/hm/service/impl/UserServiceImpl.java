package com.gsafety.management.user.hm.service.impl;

import com.gsafety.management.pojo.User;
import com.gsafety.management.user.hm.dao.UserDao;
import com.gsafety.management.user.hm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public User logon(User user) {
        return userDao.logon(user);
    }

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    public List<User> getUserByAccount(String account) {
        return userDao.getUserByAccount(account);
    }

    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
