package zhuJieDemo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 517
 * @date 2021-03-03 - 9:55
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void add2() {
        System.out.println("dao2..");
    }
}
