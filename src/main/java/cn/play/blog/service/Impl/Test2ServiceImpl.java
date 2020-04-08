package cn.play.blog.service.Impl;

import cn.play.blog.service.TestService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Test2ServiceImpl implements TestService {
    @Override
    public String select() {
        return "优先 - SELECT~~~~";
    }
}
