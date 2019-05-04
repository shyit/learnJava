package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/12.
 */
public class MySrearch {
    public static void main(String[] args){
        int[] arr=new int[]{1,22,333,444,55,6,777};

        int target=333;

        int index=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                index=i;
                break;
            }
        }

        System.out.println(index);
    }
}
