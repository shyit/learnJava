package net.htwater.think.D09.D09_04;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by 96955 on 2019/2/21.
 */
public class AdapterRandomDouble extends RandomDouble implements Readable {
    private int count;

    public AdapterRandomDouble(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (0 == count--) {
            return -1;
        }
        String result = next() + "";
        cb.append(result);
        cb.append(" ");
        return cb.length();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(new AdapterRandomDouble(7));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

}
