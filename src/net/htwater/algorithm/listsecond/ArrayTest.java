package net.htwater.algorithm.listsecond;

public class ArrayTest {
    public static void main(String[] args) {
//        ShyArray shyArray = new ShyArray();
//        shyArray.add(1);
//        shyArray.add(3);
//        shyArray.add(5);
//        shyArray.add(7);
//        shyArray.add(9);
//        shyArray.show();
//
//        int index=shyArray.binarySearch(9);
//        if (-1==index){
//            System.out.println("目标元素不在数组中");
//        }else {
//            System.out.println("目标元素所在的下标 = "+index);
//        }

//        ShyStack shyStack=new ShyStack();
//        shyStack.show();
//        System.out.println(shyStack.getEmptyStatus());
//        shyStack.push(1);
//        shyStack.push(3);
//        shyStack.push(5);
//        shyStack.push(7);
//        shyStack.push(9);
//        shyStack.push(11);
//        shyStack.show();
//        System.out.println(shyStack.pop());
//        System.out.println(shyStack.pop());
//        shyStack.show();
//        System.out.println(shyStack.getEmptyStatus());


        ShyQueue shyQueue=new ShyQueue();
        shyQueue.show();
        System.out.println(shyQueue.getEmptyStatus());
        shyQueue.add(2);
        shyQueue.add(4);
        shyQueue.add(6);
        shyQueue.add(8);
        shyQueue.add(10);
        shyQueue.add(12);
        shyQueue.show();
        System.out.println(shyQueue.poll());
        shyQueue.show();

        System.out.println(shyQueue.getEmptyStatus());
    }
}
