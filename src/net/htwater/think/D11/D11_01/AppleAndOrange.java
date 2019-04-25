package net.htwater.think.D11.D11_01;

import java.util.ArrayList;

/**
 * Created by 96955 on 2019/3/18.
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        ArrayList<Apple> appleList = new ArrayList();
        appleList.add(new Apple());
        appleList.add(new Fuji());
        appleList.add(new Gala());
        appleList.add(new Brachuen());
        appleList.add(new Apple());
        appleList.add(new Fuji());
        appleList.add(new Gala());
        appleList.add(new Brachuen());

        for (int i = 0; i < appleList.size(); i++) {
            System.out.println(appleList.get(i).getId());
        }
    }
}

class Apple {
    private static long counter;
    private long id = counter++;

    public long getId() {
        return id;
    }
}

class Fuji extends Apple {

}

class Gala extends Apple {

}

class Brachuen extends Apple {

}
