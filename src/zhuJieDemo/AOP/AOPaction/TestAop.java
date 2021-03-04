package zhuJieDemo.AOP.AOPaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @author 517
 * @date 2021-03-04 - 13:54
 */
public class TestAop {
    @Test
    public void TestAop2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AopBean.xml");
        Aop aop = context.getBean("aop",Aop.class);
        aop.add();
    }
}
