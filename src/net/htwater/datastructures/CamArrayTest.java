package net.htwater.datastructures;

public class CamArrayTest {
    public static void main(String[] args) {
        CamArray camArray=new CamArray();
        System.out.println(camArray);

        camArray.addLast(10);
        System.out.println(camArray);

        camArray.addLast(20);
        camArray.addLast(30);
        camArray.addLast(40);
        camArray.addLast(50);
        camArray.addLast(60);
        System.out.println(camArray);

        camArray.add(0,100);
        System.out.println(camArray);

        camArray.set(3,100);
        System.out.println(camArray);
        System.out.println(camArray.get(4));
    }
}
