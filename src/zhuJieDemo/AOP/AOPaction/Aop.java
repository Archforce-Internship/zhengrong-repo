package zhuJieDemo.AOP.AOPaction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

/**
 * @author 517
 * @date 2021-03-04 - 9:21
 */
@Component

public class Aop {
    public void add(){
        System.out.println("add..");
    }
}
