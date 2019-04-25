package net.htwater.think.D08_04_CompoundPattern;

/**
 * Created by 96955 on 2019/1/3.
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);

        mill = new wheetMill();
        grain = mill.process();
        System.out.println(grain);
    }

}

class Grain {
    public String toString() {
        return "Grain";
    }
}

class Wheet extends Grain {
    @Override
    public String toString() {
        return "Wheet";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class wheetMill extends Mill {
    @Override
    Wheet process() {
        return new Wheet();
    }
}