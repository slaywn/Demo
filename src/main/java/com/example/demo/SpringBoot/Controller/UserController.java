package com.example.demo.SpringBoot.Controller;

import com.example.demo.SpringBoot.entity.Token;
import com.example.demo.SpringBoot.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @GetMapping("query.do")
    public List<User> query(int size){
        String token = Token.getToken();
        if("2".equals(token)){
            List<User> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                list.add(new User( i, "测试" + i,"1234"));
            }
            return  list;
        }else {
            return null;
        }

    }
}
