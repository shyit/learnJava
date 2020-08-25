package net.htwater.think.D15_13;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by 96955 on 2019/7/3.
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterator<Coffee>{

    private int size=0;

    private Class[] types={
            Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class
    };

    private static Random random=new Random(47);

    public CoffeeGenerator() {

    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    class CoffeeIterator implements Iterator<Coffee>{

        int count=size;

        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator(){
        return  new CoffeeIterator();
    }

    public static void main(String[] args){
        CoffeeGenerator coffeeGenerator=new CoffeeGenerator(5);
        for (int i=0;i<5;i++){
            System.out.println(coffeeGenerator.next());
        }
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
