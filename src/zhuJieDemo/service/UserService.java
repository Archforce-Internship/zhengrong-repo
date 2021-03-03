package zhuJieDemo.service;


import org.springframework.stereotype.Service;

/**
 * @author 517
 * @date 2021-03-03 - 9:29
 */

@Service(value = "userService")//不写value则默认为类名首字母小写
public class UserService {
    public void add(){
        System.out.println("add...");
    }
}
