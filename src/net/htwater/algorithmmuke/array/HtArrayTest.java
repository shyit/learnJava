package net.htwater.algorithmmuke.array;

public class HtArrayTest {
    public static void main(String[] args) {
        HtArray htArray=new HtArray(5);
        System.out.println(htArray.toString());
        for (int i = 0; i < htArray.getCapacity(); i++) {
            htArray.addLast((i+2)*3);
        }
        System.out.println(htArray.toString());


        htArray.insert(3,333);
        System.out.println(htArray.toString());

        htArray.addLast(36);
        System.out.println(htArray.toString());

        htArray.remove(5);
        System.out.println(htArray.toString());

        htArray.removeLast();
        System.out.println(htArray.toString());

        htArray.removeElement(9);
        System.out.println(htArray.toString());

        htArray.remove(0);
        System.out.println(htArray.toString());

        htArray.remove(0);
        System.out.println(htArray.toString());

        htArray.remove(0);
        System.out.println(htArray.toString());

        htArray.remove(0);
        System.out.println(htArray.toString());



//        HtArray<Student> studentHtArray = new HtArray<>();
//        studentHtArray.addLast(new Student("shy", 23));
//        studentHtArray.addLast(new Student("cam", 33));
//        studentHtArray.addLast(new Student("shenhaiyun", 23));
//        studentHtArray.addLast(new Student("nap", 43));
//        System.out.println(studentHtArray.toString());
//
//        studentHtArray.remove(2);
//        System.out.println(studentHtArray.toString());

    }
}
