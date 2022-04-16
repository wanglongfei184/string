package reflection;/*
    @author shkstar
    @creat 2021-12-20-23:58
    动态性体现：假设不知道要创建谁的对象
*/

import java.net.URL;

public class ReflectionDongTaiTiXian {
    /*写一个字符串，当输入0的时候读取一个地址，当输入1的时候读取一个地址，当输入2的时候读取一个地址，
    * 把地址当url传给方法，就创好了相对应的对象*/

    public void getInstance(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(url);
        Object o = aClass.newInstance();

    }
}
