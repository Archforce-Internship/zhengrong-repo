package spring.demo.service;

import spring.demo.dao.UserDao;

/**
 * @author 517
 * @date 2021-03-02 - 9:09
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService add..");
        userDao.upData();
    }
}
