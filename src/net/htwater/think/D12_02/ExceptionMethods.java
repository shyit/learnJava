package net.htwater.think.D12_02;

/**
 * Created by 96955 on 2019/4/29.
 */
public class ExceptionMethods {
    public static void main(String[] args){
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage()= "+e.getMessage());
            System.out.println("e.getLocalizedMessage()= "+e.getLocalizedMessage());
            System.out.println("e= "+e);

            e.printStackTrace(System.err);
        }
    }
}
