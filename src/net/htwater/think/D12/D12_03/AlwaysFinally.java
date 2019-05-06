package net.htwater.think.D12.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class AlwaysFinally {

    public static void main(String[] args){
        System.out.println("Entering first try block");
        try {
            System.out.println("finally in second try block");
            try {
                throw new ForurException();
            }finally {
                System.out.println("finally in 2nd try block");
            }
        }catch (ForurException e){
            System.out.println("Caught FourException in last try block");
        }finally {
            System.out.println("finally in last try block");
        }
    }
}

class ForurException extends Exception{

}
