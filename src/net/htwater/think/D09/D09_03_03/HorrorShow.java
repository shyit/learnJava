package net.htwater.think.D09.D09_03_03;

/**
 * Created by 96955 on 2019/2/20.
 */
public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.destroy();
        d.menace();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DrangonZilla();
        u(barney);
        v(barney);

        Vampire vlad = new VeryBadVapire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class DrangonZilla implements DangerousMonster {

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

class VeryBadVapire implements Vampire {
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
