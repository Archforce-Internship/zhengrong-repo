package zhuJieDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhuJieDemo.service.UserService;

/**
 * @author 517
 * @date 2021-03-03 - 9:32
 */
public class TestZhuJie {
    @Test
    public void TestUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("scannerZuJian.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
