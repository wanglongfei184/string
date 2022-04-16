package reflection;/*
    @author shkstar
    @creat 2021-12-21-0:18
    如何获取运行时类的指定属性
*/

public class Field {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.创获取指定类的class
        Class<Person> personClass = Person.class;
        //2.获取运行类对象
        Person person = personClass.newInstance();
        //3.获取运行时类中指定变量名的属性
        java.lang.reflect.Field name = personClass.getDeclaredField("name");
        //4.保证当前属性是可访问的
        name.setAccessible(true);
        //5.获取，设置指定对象的此属性的值
        name.set(person, "小王");
        System.out.println( name.get(person));;
    }

}
