package com.SpringWeb.Controller;

import com.SpringWeb.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class usercontroller {
    @GetMapping("/users")
    public String save(){
        System.out.println("user save is running");
        return "{'module':'user'}";
    }

    @RequestMapping("/pojo")
    public String pojo(User user){

        System.out.println("user pojo is running");
        return "{'message':'creat success'}";
    }
}
