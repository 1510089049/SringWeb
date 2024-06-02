package com.SpringWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class usercontroller {
    @RequestMapping("user")
    @ResponseBody
    public String save(){
        System.out.println("user save is running");
        return "{'module':'user'}";
    }
}
