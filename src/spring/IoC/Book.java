package spring.IoC;

/**
 * @author 517
 * @date 2021-03-01 - 19:50
 */
public class Book {


    public String bName;
    public String value1;

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

//set加配置文件注入属性

    public void scan(){
        System.out.println(bName + "" + value1);
    }

}
