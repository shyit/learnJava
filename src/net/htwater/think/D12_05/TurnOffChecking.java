package net.htwater.think.D12_05;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by cambrian on 2019/5/6.
 */
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wrapCheckedException=new WrapCheckedException();

        for (int i=0;i<4;i++){
            try {
                if (i<3){
                    wrapCheckedException.throwRuntmeExceptin(i);
                }else {
                    throw new SomeOtherException();
                }
            }catch (SomeOtherException e){
//                e.printStackTrace();
                System.out.println("SomeOtherException::::"+e);
            }catch (RuntimeException e){
                try {
                    throw e.getCause();
                } catch (FileNotFoundException ee) {
                    System.out.println("FileNotFoundException::::"+ee);
                }catch (IOException ee) {
                    System.out.println("IOException::::"+ee);
                }catch (RuntimeException ee) {
                    System.out.println("RuntimeException::::"+ee);
                }catch (Throwable ee) {
                    System.out.println("Throwable::::"+ee);
                }
            }
        }
    }
}

class WrapCheckedException {
    void throwRuntmeExceptin(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
//                    break;
                case 1:
                    throw new IOException();
//                    break;
                case 2:
                    throw new RuntimeException("Where am I");
//                    break;
                default:
                    return;
            }
        } catch (Exception e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception{

}
