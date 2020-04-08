package cn.play.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		//1 启动tomcat
		//2 自动创建 spring 容器
		//3 spring 容器创建后, 自动扫描某些包下的,某些bean, 自动装配到容器中
		// BlogApplication 相当于一个配置文件 @SpringBootApplication
		// @ComponentScan 自动配置, 扫描 BlogApplication 下面的包和子类包中的bean
		SpringApplication.run(BlogApplication.class, args);
	}

}
