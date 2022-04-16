package reflection;/*
    @author shkstar
    @creat 2021-12-20-21:01
*/

import org.junit.Test;

//              Class的实例就对应着一个运行时类
//那些类型可以有 Class对象         数组（new int【5】和new int【100】他两的Class对象相同），
// 枚举类，接口，primitiveType（基本数据类型）
public class RefactionTest {
    //创建Class的实例
    @Test
    public void test1() throws ClassNotFoundException {
        //方式1.调用运行时类的属性.class
        Class<Person> class1 = Person.class;
           //方式2.通过运行时类的对象调用getclass（）
        Person p1 = new Person();
        Class<? extends Person> class2 = p1.getClass();
        //方式3.调用Class的静态方法.forName(String classPath)
        Class<?> class3 = Class.forName("reflection.Person");
        //方式4.使用类的加载器ClassLoader（）//了解就好
        java.lang.ClassLoader classLoader = RefactionTest.class.getClassLoader();
        Class<?> class4 = classLoader.loadClass("reflection.Person");

        System.out.println(class1);
        System.out.println(class1==class2);
        System.out.println(class1==class3);

    }

}
