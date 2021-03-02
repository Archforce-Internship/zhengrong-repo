package collectionType;

import java.util.*;

/**
 * @author 517
 * @date 2021-03-02 - 13:53
 */
public class Stu {
    private String[] courses;

    private List<String> list;

    private Map<String,String> map;

    private Set<String> set;

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}
