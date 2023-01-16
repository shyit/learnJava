package net.htwater.algorithmmuke.sort;

import java.util.Random;

public class SelectSortTest {
    public static void main(String[] args) {

        int[] dataSizes = {1000, 100000};

//        int count=1000;

        for (int i = 0; i < dataSizes.length; i++) {
            Integer[] nums = generateRandomArray(dataSizes[i]);

            SortingHelper.sortTest("selectSort", nums);
        }


        //        Student studentOne = new Student();
        //        studentOne.setName("cam");
        //        studentOne.setAge(32);
        //        Student studentTwo = new Student();
        //        studentTwo.setName("shy");
        //        studentTwo.setAge(33);
        //        Student studentThree = new Student();
        //        studentThree.setName("nap");
        //        studentThree.setAge(16);
        //        Student studentFour = new Student();
        //        studentFour.setName("shy");
        //        studentFour.setAge(33);
        //
        //        Student[] students = new Student[]{studentOne, studentTwo, studentThree, studentFour};
        //        System.out.println(Arrays.toString(students));
        //        SelectSort.sort(students);
        //        System.out.println(Arrays.toString(students));
    }

    public static Integer[] generateRandomArray(int count) {
        Random random = new Random();

        Integer[] arr = new Integer[count];

        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt((i + 10) * 2);
        }

        return arr;
    }
}