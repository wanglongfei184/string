package reflection;/*
    @author shkstar
    @creat 2021-12-20-21:44
    对类加载器ClassLoader的认识
*/

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoader {
    @Test
    public void test() throws IOException {
        //1获取自定义类的类加载器：系统类加载器
        java.lang.ClassLoader c1 = Person.class.getClassLoader();
        System.out.println(c1);
        //2获取系统类加载器的父类：扩展类加载器
        java.lang.ClassLoader c2 = c1.getParent();
        System.out.println(c2);
        //3.获取扩展类加载器的父类：引导类加载器
        //引导类加载器无法获取，里面是主要类库
        java.lang.ClassLoader c3 = c2.getParent();
        System.out.println(c3);

        //通过类加载器的方式加载properties配置文件(原来是直接通过properties)
        //读取位置当前moudle的src下
        Properties properties = new Properties();
        java.lang.ClassLoader classLoader2 = ClassLoader.class.getClassLoader();//当前类：获取类加载器
        InputStream is = classLoader2.getResourceAsStream("jdbc1.properties");//通过加载器获取流
         properties.load(is);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println(name+"\n"+password);
       is.close();
    }
}
