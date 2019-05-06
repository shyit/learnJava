package net.htwater.think.D12.D12_05;

import java.io.FileInputStream;

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
