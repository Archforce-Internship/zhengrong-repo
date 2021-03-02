package spring.testDemo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.IoC.Book;
import spring.IoC.Orders;
import spring.IoC.User;
import spring.demo.dao.UserDao;
import spring.demo.dao.UserDaoImpl;
import spring.demo.service.UserService;


/**
 * @author 517
 * @date 2021-03-01 - 17:34
 */
public class TestSpring5 {
    @Test
    public void TestDdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");//BeanFactory是spring内置使用接口，一般不提供给开发者用,加载配置文件时不创建对象，获取或使用才创建。Application是子接口，更多功能，建议使用
        User user = context.getBean("user1", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void TestBook(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context2.getBean("book",Book.class);
        System.out.println(book);
        book.scan();
    }

    @Test
    public void TestOrders(){
        ApplicationContext context3 = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context3.getBean("Orders", Orders.class);
        System.out.println(orders);
        orders.sendO();
    }

    @Test
    public void TestBean(){
        ApplicationContext context4 = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context4.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
