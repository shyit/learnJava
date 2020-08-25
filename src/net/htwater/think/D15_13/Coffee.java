package net.htwater.think.D15_13;

/**
 * Created by 96955 on 2019/7/3.
 */
public class Coffee {
    private static long counter=0;

    private final long id=counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "id=" + id +
                '}';
    }



}

class Latte extends Coffee{

}

class Mocha extends Coffee{

}

class Cappuccino extends Coffee{

}

class Americano extends Coffee{

}

class Breve extends Coffee{

}