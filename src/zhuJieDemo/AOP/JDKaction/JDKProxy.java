package zhuJieDemo.AOP.JDKaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 517
 * @date 2021-03-03 - 16:57
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {newDao.class};
        newDaoImpl newDao = new newDaoImpl();//
        newDao o = (newDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new newDaoProxy(newDao));
        int jg = o.add(1, 2);
        System.out.println("结果：" + jg);
    }
}

//代理对象代码
class newDaoProxy implements InvocationHandler{

    public newDaoImpl obj;
    public newDaoProxy (newDaoImpl obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前");
        Object res = method.invoke(obj,args);
        System.out.println("方法之后");
        return res;
    }
}