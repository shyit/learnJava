package net.htwater.algorithm.base;

public class HanoiTest {
    public static void main(String[] args) {
        hanoi(3,"a","b","c");
    }

    private static void hanoi(int n,String left,String middle,String right) {
        if (n==1){
            System.out.println("第1个盘子从"+left+"移动到"+right);
        }else {
            hanoi(n-1,left,right,middle);
            System.out.println("第"+n+"个盘子从"+left+"移动到"+right);
            hanoi(n-1,middle,left,right);
        }
    }
}
