package net.htwater.think.D15_13;

/**
 * Created by 96955 on 2019/7/3.
 */
public class Fibonacci implements Generator<Integer>{

    private int count=0;

    private int fib(int n){
        if (n<2) {
            return 1;
        }else {
            return fib(n-2)+fib(n-1);
        }
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args){
        Fibonacci fibonacci=new Fibonacci();
        for (int i=0;i<18;i++){
            System.out.print(fibonacci.next()+"  ");
        }
    }
}
