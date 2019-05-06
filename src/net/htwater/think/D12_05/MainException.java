package net.htwater.think.D12_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by cambrian on 2019/5/6.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream=new FileInputStream("MainException.java");
        fileInputStream.close();
    }

//    public static void main(String[] args){
//        try {
//            FileInputStream fileInputStream=new FileInputStream("MainException.java");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
}
