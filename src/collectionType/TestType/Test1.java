package collectionType.TestType;

import collectionType.Book;
import collectionType.FactoryBean.MyBean;
import collectionType.Stu;
import collectionType.courses;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 517
 * @date 2021-03-02 - 14:08
 */
public class Test1 {
    @Test
    public void TestCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void TestBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanForPublic.xml");
        Book book = context.getBean("Book", Book.class);
        Book book2 = context.getBean("Book", Book.class);
        book.ou();
        book2.ou();
    }

    @Test
    public void TestFBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanForFactory.xml");
        courses courses = context.getBean("myBean", courses.class);
        System.out.println(courses);
    }
}
