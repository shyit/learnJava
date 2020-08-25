package net.htwater.algorithm.base;

public class SearchTest {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,7,9,11};
        int target=5;
        int index=-1;

        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                index=i;
                break;
            }
        }

        if (-1==index){
            System.out.println("目标元素不在数组中");
        }else {
            System.out.println("目标元素所在的下标 = "+index);
        }

    }
}
