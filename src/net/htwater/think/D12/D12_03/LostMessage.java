package net.htwater.think.D12.D12_03;

/**
 * Created by cambrian on 2019/5/4.
 */
public class LostMessage {
    private static void f() throws VeryImportantException{
        throw new VeryImportantException();
    }

    private static void dispose() throws NormalException{
        throw new NormalException();
    }

    public static void main(String[] args){
        try {
            try {
                f();
            }finally {
                dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very import exception";
    }
}

class NormalException extends Exception{
    @Override
    public String toString() {
        return "A normal exception";
    }
}
