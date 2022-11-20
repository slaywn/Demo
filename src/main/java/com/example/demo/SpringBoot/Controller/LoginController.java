package com.example.demo.SpringBoot.Controller;

import com.example.demo.SpringBoot.entity.Token;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/login/")
public class LoginController {

    @GetMapping("login.do")
    public String Login(String name, String pass) {
        if(name.equals("张三") && pass.equals("1234")){
            Token.setToken("2");
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
