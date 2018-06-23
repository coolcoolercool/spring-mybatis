package cn.itheima.test;

import cn.itheima.mapper.UserMapper;
import cn.itheima.pojo.User;
import cn.itheima.pojo.UserExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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


    /*@Test
    public void testFindUserById() throws Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }*/

    @Test
    public void testFindUserId() throws Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);

    }

    @Test
    public void testFindUserAndSex() throws Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");


        //创建UserExample对象
        UserExample userExample = new UserExample();
        //通过UserExample对象创建查询条件封装对象(Criteria中的封装的查询条件)
        UserExample.Criteria createCriteria = userExample.createCriteria();

        //加入查询
        createCriteria.andUsernameLike("%王%");
        createCriteria.andSexEqualTo("1");

        List<User> list = userMapper.selectByExample(userExample);
        System.out.println(list);
    }

}

















