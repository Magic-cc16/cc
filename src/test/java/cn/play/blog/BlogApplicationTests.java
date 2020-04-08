package cn.play.blog;

import cn.play.blog.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//读取的配置类与 web 统一
@ContextConfiguration(classes = BlogApplication.class)
// ApplicationContextAware 获取 spring 容器
public class BlogApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Autowired
    private TestService testService;

    //容器
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //获取bean 调用方法
    @Test
    public void getBean() {
        //TestService 有两个实现时 加 @Primary 的实现优先
        TestService bean = applicationContext.getBean(TestService.class);
        System.out.println(bean.select());
        System.out.println(testService.select());

        //按名称强制选择非优先的
        TestService testService = applicationContext.getBean("testServiceImpl", TestService.class);
        System.out.println(testService.select());
    }

    @Test

    public void contextLoads() {
    }
}
