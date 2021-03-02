package collectionType.FactoryBean;

import collectionType.courses;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 517
 * @date 2021-03-02 - 14:56
 */
public class MyBean implements FactoryBean<courses> {

    @Override
    public courses getObject() throws Exception {
        courses courses5 = new courses();
        courses5.setCoursesName("abe");
        return courses5;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
