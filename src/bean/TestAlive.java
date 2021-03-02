package bean;

import autoWrite.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 517
 * @date 2021-03-02 - 17:17
 */
public class TestAlive {
    @Test
    public void TestBeanAlive(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("orders.xml");
            orders orders1 = context.getBean("orders", orders.class);
            System.out.println("得到对象");
            System.out.println(orders1);
        context.close();
        }

    @Test
    public void TestAuto(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanForAuto.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
