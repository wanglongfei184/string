package reflection;/*
    @author shkstar
    @creat 2021-12-20-23:21
    通过反射创建运行时类的对象
*/

import org.junit.Test;

public class NewInstanceTest {
    //*要想此方法正常创建要求
    // 1.此方法必须提供空参构造器
    // 2.空参构造器的权限得够，通常public
    //
    // 在javaben中提供空参构造器原因
    // 1.防止作为父类，子类无法继承默认super（）
    // 2.便于反射，创建运行时类的对象*/
    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();//获取person类的对象调空can构造器
        System.out.println(person);
    }
}
