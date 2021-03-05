import entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceQ;

/**
 * @author 517
 * @date 2021-03-04 - 20:50
 */
public class TestClass {

    @Test
    public void TestSql(){
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanJDBC.xml");
        ServiceQ serviceQ = context.getBean("serviceQ",ServiceQ.class);
        Book book = new Book();
        book.setUserID("1");
        book.setUsername("java");
        book.setUstatus("into");
        serviceQ.addBook(book);

    }
}
