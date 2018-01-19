package com.gsafety.management.user.hm.dao.impl;

import com.gsafety.management.pojo.User;
import com.gsafety.management.user.hm.dao.UserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public void addUser(User user) {
        hibernateTemplate.save(user);
    }

    public void updateUser(User user) {
        hibernateTemplate.saveOrUpdate(user);
    }

    public User logon(User user) {
        List<User> list = (List<User>) hibernateTemplate.find("from User where account = ? and password = ?", user.getAccount(), user.getPassword());
        return list.size() > 0 ? list.get(0) : null;
    }

    public User getUserById(Integer id) {
        List<User> list = (List<User>) hibernateTemplate.find("from User where id = ?", id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<User> getUserByAccount(String account) {
        List<User> list = (List<User>) hibernateTemplate.find("from User where account like ?", "%" + account + "%");
        return list.size() > 0 ? list : null;
    }

    public List<User> getUsers() {
        List<User> list = (List<User>) hibernateTemplate.find("from User");
        return list.size() > 0 ? list : null;
    }
}
