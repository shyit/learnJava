package net.htwater.think.D12_02;

import java.io.FileNotFoundException;

/**
 * Created by 96955 on 2019/4/29.
 */
public class HtException {
    public static void main(String[] args){
        try {
            g();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void f() throws FileNotFoundException {
        throw new FileNotFoundException("this is filt not found");
    }

    private static void g() throws FileNotFoundException {
        if (false){
            throw new FileNotFoundException("this is filt not found");
        }
        throw new NullPointerException("this is null pointer");
    }
}
