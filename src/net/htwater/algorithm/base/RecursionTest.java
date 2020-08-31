package net.htwater.algorithm.base;


public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(fibonacci(30));


    }

    //斐波那契数列
    private static int fibonacci(int i) {
        if (i<=0){
            throw new RuntimeException("下标错误");
        }

        if (i==1||i==2){
            return 1;
        }

        return fibonacci(i-1)+fibonacci(i-2);
    }

}
