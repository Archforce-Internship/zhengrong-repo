package spring.IoC;

/**
 * @author 517
 * @date 2021-03-01 - 20:08
 */
public class Orders {

    private String OName;
    private String address;
    public Orders(String OName,String address){
        this.OName = OName;
        this.address = address;
    }

    public void sendO(){
        System.out.println((OName) + (address));
    }
}
