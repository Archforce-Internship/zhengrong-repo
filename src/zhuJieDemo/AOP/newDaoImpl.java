package zhuJieDemo.AOP;

/**
 * @author 517
 * @date 2021-03-03 - 16:56
 */
public class newDaoImpl implements newDao{

    @Override
    public int add(int a, int b) {
        System.out.println("using");
        return a + b;

    }

    @Override
    public String upData(String id) {
        return id;
    }
}
