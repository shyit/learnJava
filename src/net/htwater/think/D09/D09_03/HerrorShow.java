package net.htwater.think.D09.D09_03;

/**
 * Created by 96955 on 2019/1/7.
 */
public class HerrorShow {
    public static void main(String[] args) {
        DragonZilla dragonZilla = new DragonZilla();
        dragonZilla.destroy();
        dragonZilla.kill();
        dragonZilla.menace();

        VereyBadVampire vereyBadVampire = new VereyBadVampire();
        vereyBadVampire.destroy();
        vereyBadVampire.drinkBlood();
        vereyBadVampire.kill();
        vereyBadVampire.menace();
    }
}

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
    void kill();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VereyBadVampire implements Vampire {

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}

class DragonZilla implements DangerousMonster, Lethal {

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }
}