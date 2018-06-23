package cn.itheima.test;

import cn.itheima.mapper.UserMapper;
import cn.itheima.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: zzw5005
 * date: 2018/6/21 15:23
 */


public class UserMapperTest {
    private ApplicationContext applicationContext;


    //作用:在测试方法前执行这个方法
    @Before
    public void setUp() throws Exception{
        String configLocation = "classpath:ApplicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }


    @Test
    public void testFindUserById() throws Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}

















