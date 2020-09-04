package net.htwater.algorithm.eightsort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        shellSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void shellSort(int[] arr) {

        //遍历所有步长
        for (int step=arr.length/2;step>0; step=step/2){
            for (int i = 0; i < step; i++) {
                for (int j = i+step; j < arr.length; j=j+step) {
                    int temp=arr[j];

                    int k= j;
                    while ( k >i && arr[k-step]>temp) {
                        arr[k]=arr[k-step];
                        k=k-step;
                    }
                    arr[k]=temp;
                }
            }

        }

    }
}
