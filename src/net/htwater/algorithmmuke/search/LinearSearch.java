package net.htwater.algorithmmuke.search;

public class LinearSearch {
    private LinearSearch(){

    }

    public static <E> int search(E[] nums,E target){
        for (int i = 0; i < nums.length; i++) {
            E data=nums[i];
            if (target.equals(data)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int count=100000000;
        Integer[] nums=ArrayGenerator.generateOrderedArray(count);
//        System.out.println(LinearSearch.search(nums,7));
//        System.out.println(LinearSearch.search(nums,150));
        Long start=System.nanoTime();
        System.out.println(LinearSearch.search(nums,count));
        Long end=System.nanoTime();
        System.out.println((end-start)*1.0/(1000*1000*1000));

//        Student studentOne=new Student();
//        studentOne.setName("cam");
//        studentOne.setAge(32);
//        Student studentTwo=new Student();
//        studentTwo.setName("shy");
//        studentTwo.setAge(33);
//        Student studentThree=new Student();
//        studentThree.setName("nap");
//        studentThree.setAge(16);
//        Student studentFour=new Student();
//        studentFour.setName("shy");
//        studentFour.setAge(33);
//
//
//        Student[] stus={studentOne,studentTwo,studentThree};
//
//        System.out.println(LinearSearch.search(stus,studentOne));
//        System.out.println(LinearSearch.search(stus,studentTwo));
//        System.out.println(LinearSearch.search(stus,studentFour));
    }


}
