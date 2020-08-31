package net.htwater.datastructures;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr=new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for (int a: arr) {
            System.out.print(a+" ");
        }
        System.out.println();

    }
}
