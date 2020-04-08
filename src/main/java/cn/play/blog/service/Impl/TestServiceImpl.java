package cn.play.blog.service.Impl;

import cn.play.blog.service.TestService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service  //("testServiceImpl") 默认名称类名 首字母小写
@Scope
public class TestServiceImpl implements TestService {
    @Override
    public String select() {
        return "SELECT~~~~";
    }
}
