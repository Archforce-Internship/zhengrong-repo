package spring.demo.dao;

/**
 * @author 517
 * @date 2021-03-02 - 9:10
 */
public class UserDaoImpl implements UserDao{

    public int id;
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void upData() {
        System.out.println("dao upData");
        System.out.println(id);
    }
}
