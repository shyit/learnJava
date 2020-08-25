package net.htwater.algorithm.base;

public class Test {
    public static void main(String[] args) {
        ShyArray shyArray = new ShyArray();
        shyArray.add(1);
        shyArray.add(3);
        shyArray.add(5);
        shyArray.add(7);
        shyArray.add(9);
        shyArray.show();

        int index=shyArray.binarySearch(9);
        if (-1==index){
            System.out.println("目标元素不在数组中");
        }else {
            System.out.println("目标元素所在的下标 = "+index);
        }
    }
}
