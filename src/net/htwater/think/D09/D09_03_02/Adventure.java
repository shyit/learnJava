package net.htwater.think.D09.D09_03_02;

/**
 * Created by 96955 on 2019/2/15.
 */
public class Adventure {
    public static void f(CanFight x) {
        x.fight();
    }

    public static void s(CanSwim x) {
        x.swim();
    }

    public static void ff(CanFly x) {
        x.fly();
    }

    public static void a(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args){
        Hero hero=new Hero();
        f(hero);
        s(hero);
        ff(hero);
        a(hero);
    }
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
