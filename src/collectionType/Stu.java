package collectionType;

import java.util.*;

/**
 * @author 517
 * @date 2021-03-02 - 13:53
 */
public class Stu {
    private List<courses> coursesList;
    private Map<String,String> map;
    private Set<String> set;
    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCoursesList(List<courses> coursesList) {
        this.coursesList = coursesList;
    }

    public void test(){
//        System.out.println(courses);
//        System.out.println(map);
//        System.out.println(set);
        System.out.println(coursesList);
    }
}
