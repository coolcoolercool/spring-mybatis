package cn.itheima.dao;

import cn.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/20 19:37
 */


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    @Override
    public User findUserById(Integer id) {
        //sqlSession是线程不安全的，所以他的最佳使用范围在方法体内
        SqlSession openSession = this.getSqlSession();
        User user = openSession.selectOne("test.findUserById", id);

        //整合以后会话会话归spring管理，所以不需要手动关闭
        //openSession.close();

        return user;
    }

    @Override
    public List<User> findUserByUserName(String userName) {
        SqlSession openSession = this.getSqlSession();
        List<User> list = openSession.selectList("test.findUserByUserName", userName);
        return list;
    }
}
