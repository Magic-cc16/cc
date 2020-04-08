package cn.play.blog;

import cn.play.blog.community.entity.User;
import cn.play.blog.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BlogApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void user() {

        User user1 = userMapper.selectById(1);
        System.out.println(user1);

       /* User user = new User();
        user.setUsername("user test");
        user.setPassword("123");
        user.setActivationCode("ABCD");
        user.setEmail("@qq.com");
        user.setHeaderUrl("url");
        user.setSalt("1234");
        user.setStatus(1);
        user.setType(1);
        userMapper.insertUser(user);
        System.out.println(user.getId());*/
    }

    @Test
    public void updateUser() {

        User user1 = userMapper.selectById(150);
        System.err.println(user1);

        userMapper.updateStatus(150, 2);
        System.err.println(userMapper.selectById(150));
    }
}
