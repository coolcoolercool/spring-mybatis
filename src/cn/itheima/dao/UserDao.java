package cn.itheima.dao;

import cn.itheima.pojo.User;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/20 19:36
 */


public interface UserDao {
    public User findUserById(Integer id);
    public List<User> findUserByUserName(String userName);
}
