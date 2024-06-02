package com.SpringWeb;

import com.SpringWeb.Controller.usercontroller;
import com.SpringWeb.Dao.Impl.UserDAOImpl;
import com.SpringWeb.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserDAOImpl bean1 = context.getBean(UserDAOImpl.class);
        usercontroller bean = context.getBean(usercontroller.class);
        bean.save();
        bean1.Say();
    }
}
