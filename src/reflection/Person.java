package reflection;/*
    @author shkstar
    @creat 2021-12-20-21:01
*/

public class Person {
    public Person(){

    }
    private String name;
    private String show(String o){
        String s=new String("看万里河山");
        System.out.println(s);
        return s;
    }
    private static void see(){
        System.out.println("让我seesee你");
    }
}
