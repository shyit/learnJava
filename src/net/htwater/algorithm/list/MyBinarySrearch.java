package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/12.
 */
public class MyBinarySrearch {
    public static void main(String[] args){
        int[] arr=new int[]{11,22,33,44,55,66,77};

        int target=77;

        int index=-1;

        int begin=0;
        int end=arr.length-1;
        int middle=0;

        while (begin<=end){
            middle=(begin+end)/2;
            if (arr[middle]<target){
                begin=middle+1;
            }else if(arr[middle]==target){
                index=middle;
                break;
            }else {
                end=middle-1;
            }
        }

        System.out.println(index);
    }
}
