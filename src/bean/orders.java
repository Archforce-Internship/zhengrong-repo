package bean;

/**
 * @author 517
 * @date 2021-03-02 - 17:12
 */
public class orders {

    public orders(){
        System.out.println("创建bean实例");
    }

    private String oName;

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("调用set方法" + oName);
    }
    public void init(){
        System.out.println("初始化方法");
    }
    public void des(){
        System.out.println("销毁方法");
    }

}
//生命周期