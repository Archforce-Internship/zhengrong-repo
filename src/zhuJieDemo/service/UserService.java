package zhuJieDemo.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import zhuJieDemo.dao.UserDao;

import javax.swing.*;


/**
 * @author 517
 * @date 2021-03-03 - 9:29
 */

@Service(value = "userService")//不写value则默认为类名首字母小写
public class UserService {

    @Autowired//自动注入（对象）
    @Qualifier(value = "userDaoImpl1")//根据名称注入，适用于多个实现类
    private UserDao userDao;

    public void add(){
        System.out.println("add...");
        userDao.add2();
    }
}
//@Service
//@Component
//@Controller
//@Repository 四种注解创建