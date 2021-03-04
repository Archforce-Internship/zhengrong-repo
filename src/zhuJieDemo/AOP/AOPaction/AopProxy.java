package zhuJieDemo.AOP.AOPaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @author 517
 * @date 2021-03-04 - 9:21
 */
@Component
@Aspect
public class AopProxy {

    @Pointcut(value = "execution(* zhuJieDemo.AOP.AOPaction.Aop.add(..))")
    public void point(){};
//提取公共切入点
    @Before(value = "point()")
    public void beFore(){
        System.out.println("之前");
    }
    @After(value = "execution(* zhuJieDemo.AOP.AOPaction.Aop.add(..))")
    public void after(){
        System.out.println("之后");
    }

    @AfterReturning(value = "execution(* zhuJieDemo.AOP.AOPaction.Aop.add(..))")//返回值之后执行
    public void AfterR(){
        System.out.println("返回后");
    }

    @AfterThrowing(value = "execution(* zhuJieDemo.AOP.AOPaction.Aop.add(..))")
    public void afterT(){
        System.out.println("抛错之后");
    }

    @Around(value = "execution(* zhuJieDemo.AOP.AOPaction.Aop.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }


}
