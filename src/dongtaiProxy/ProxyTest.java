package dongtaiProxy;/*
    @author shkstar
    @creat 2021-12-21-22:04
    动态代理例子
*/

/*
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ProxySelector;

interface Human{
    String getBelif();
    void eat(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelif() {
        return new String("i belif i can fly");
    }

    @Override
    public void eat(String food) {
        System.out.println("超人吃"+food);
    }
}
//1.如何动态创建代理类及其对象？
//2.当通过代理类的对象调用方法时如何调用被代理类的同名方法？

//生产代理类的工厂
class ProxyFactor{
    //此方法返回代理类的对象，形参obj是被代理类的对象
    public static Object getProxyInstance(Object obj){
        MyInvocationHander myInvactionHander = new MyInvocationHander();

        myInvactionHander.bind(obj);

        return   Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),myInvactionHander);
    }
}

class MyInvocationHander implements InvocationHandler{
   private Object obj;//被代理类的对象

    public void bind(Object obj){//方便让创代理类对象的时候把被代理类的对象放进去
        this.obj=obj;
    }

    //当我们通过代理类调方法a时，就会自动调invoke（）
    //将被代理类要执行的方法a的功能就声明在invoke（）中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method为代理类所调用的方法
        //obj被代理类的对象
        Object returnVa = method.invoke(obj, args);
        //返回值就是当前类invoke（）的返回值
        return returnVa;
    }
}
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //代理类
        ProxyFactor proxyFactor = new ProxyFactor();
        //创建代理类对象
        Human proxyInstance = (Human) proxyFactor.getProxyInstance(superMan);
        proxyInstance.eat("麻辣香锅");
        String belif = proxyInstance.getBelif();
        System.out.println(belif);
    }
}
*/
