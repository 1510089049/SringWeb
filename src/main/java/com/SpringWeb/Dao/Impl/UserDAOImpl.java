package com.SpringWeb.Dao.Impl;

import com.SpringWeb.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDao {

    @Override
    public void Say() {
        System.out.println("UserDaoImpl is running");
    }
}
