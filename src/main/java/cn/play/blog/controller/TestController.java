package cn.play.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping("/login")
    //默认返回的是页面 加ResponseBody
    @ResponseBody
    public String login() {
        return "LOGIN!!";
    }

    // == get ==

    //? 传参
    @GetMapping("/param")
    //默认返回的是页面 加ResponseBody
    @ResponseBody
    public void param(@RequestParam(name = "a", required = false, value = "1") String a) {
        System.out.println(a);
    }

    //路径传参
    @GetMapping("/param/{id}")
    //默认返回的是页面 加ResponseBody
    @ResponseBody
    public void pathVariable(@PathVariable("id") Integer id) {
        System.out.println(id);
    }


    //返回视图路径
    @GetMapping("/view")
    public String view(Model model){
        System.out.println("view------------");
        model.addAttribute("name","名字");
        model.addAttribute("age","123");
        model.addAttribute("ages","23");
        return "/demo/view";

    }

    //json 数据 异步请求(不进行页面跳转)

}
