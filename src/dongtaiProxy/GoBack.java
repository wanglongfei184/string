package dongtaiProxy;/*
    @author shkstar
    @creat 2022-01-11-12:13
    1.11复习jdk动态代理重写版
*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GoBack {
    public static void main(String[] args) {
        Bussesman bussesman = new Bussesman();

        ProxyFactor proxyFactor = new ProxyFactor();
        //代理类
        Human proxy = (Human) proxyFactor.getProxy(bussesman);
        proxy.eat("小王");
        proxy.getBelive();
    }
}
    //接口
 interface Human{
        String getBelive();
        void eat(String s);
    }
    //目标对象类
    class Bussesman implements Human{

        @Override
        public String getBelive() {
            return "我相信我能挣钱";
        }

        @Override
        public void eat(String s) {
            System.out.println(s+"开吃");
        }
    }

    //2.动态代理工厂
    class ProxyFactory{
             //此方法返回代理类
        public static Object getProxy(Object obj){
            MyInvoctaionHander myInvoctaionHander = new MyInvoctaionHander();
            myInvoctaionHander.setObj(obj);
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvoctaionHander);
        }
    }

    //1.invoctaionHander创建工厂，只要传入obj，就自动进入InvocationHandler的invoke方法
    class MyInvoctaionHander implements InvocationHandler{
         Object obj;
         void setObj(Object obj){this.obj=obj;}
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("++++++");
            return method.invoke(obj, args);//如果目标对象方法有参数就返回，没有就返回null

        }
    }



