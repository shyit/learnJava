package net.htwater.think.D09.D09_03;

/**
 * Created by 96955 on 2019/1/7.
 */
public class Advanture {
    public static void fight(CanFight canFight) {
        canFight.fight();
    }

    public static void swim(CanSwim canSwim) {
        canSwim.swim();
    }

    public static void fly(CanFly canFly) {
        canFly.fly();
    }

    public static void x(ActionCharacter actionCharacter) {
        actionCharacter.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        fight(hero);
        swim(hero);
        fly(hero);
        x(hero);
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

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
