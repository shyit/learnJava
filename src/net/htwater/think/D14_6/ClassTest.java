package net.htwater.think.D14_6;

/**
 * Created by cambrian on 2019/5/9.
 */
public class ClassTest {
    public static void main(String[] args){
        Class c=int.class;
        System.out.println(c);
        c=double.class;
        System.out.println(c);
        c=Double.class;
        System.out.println(c);

        Class<? extends Number> bounded=int.class;
        bounded=double.class;
        System.out.println(bounded);
        bounded=Number.class;
        System.out.println(bounded);
    }
}
