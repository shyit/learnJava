package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/11.
 */
public class MyArrayTest {

    public static void main(String[] args){
        MyArray myArray=new MyArray();
        System.out.println(myArray.size());
        myArray.show();
        myArray.add(1);
        myArray.show();
        myArray.add(11);
        myArray.show();
        myArray.add(110);
        myArray.show();
        myArray.add(1100);
        myArray.show();
        myArray.add(111);
        System.out.println(myArray.size());
        myArray.show();

        myArray.remove(2);
        myArray.show();

        System.out.println(myArray.get(2));

        myArray.insert(1,123);
        myArray.show();

        System.out.println(myArray.search(1100));
        System.out.println(myArray.binarySearch(1100));
    }
}
