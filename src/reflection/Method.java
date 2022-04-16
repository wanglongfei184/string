package reflection;/*
    @author shkstar
    @creat 2021-12-21-12:40
    获取运行时类的指定方法
*/

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class Method {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Person> personClass = Person.class;
        //获取运行时类的对象
        Person person = personClass.newInstance();
        //1获取运行时类的指定方法.getDeclaredMethod()  参数一：方法名  参数二：指明获取的方法的形参列表
        java.lang.reflect.Method show = personClass.getDeclaredMethod("show", String.class);
        //2保证方法是可访问的
        show.setAccessible(true);
        //通过Method可以调用方法
        // 3.调用invoke（）    参数一：方法的调用者  参数二：给方法形参赋的实参
        //invoke的返回值及为方法中的返回值
        Object methodReturnValues = show.invoke(person, "");
        System.out.println(methodReturnValues);

        System.out.println("------------------------如果是静态的方法-----------");
        java.lang.reflect.Method see = personClass.getDeclaredMethod("see");
        see.setAccessible(true);
        see.invoke(null);//可以用null
    }
    //调用运行类的构造器（一般不用，他就是来造对象的）
    @Test
    public void test(){

    }
}
