package spring;

/**
 * @author 517
 * @date 2021-03-01 - 17:10
 */
public class user {
    public static void main(String[] args) {
        used use1 = usedFactory.createUsed();
        use1.add();
    }
}

class used{
    public void add(){
        System.out.println("i m spring.used");
    }
}

class usedFactory extends used{
    public static used createUsed(){
        return new used();
    }
}