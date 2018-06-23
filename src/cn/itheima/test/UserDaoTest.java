package cn.itheima.test;

import cn.itheima.dao.UserDao;
import cn.itheima.pojo.User;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: zzw5005
 * date: 2018/6/21 14:33
 */


public class UserDaoTest {

    private ApplicationContext applicationContext;

    //作用:在测试方法前执行这个方法
    @Before
    public void setUp() throws Exception{
        String configLocation = "classpath:ApplicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void testFindUserById() throws Exception{
        //获取UserDao对象, getBean中的字符串是在ApplicationContext.xml中声明的
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");


        User user = userDao.findUserById(1);
        System.out.println(user);
    }


}










































