package net.htwater.think.P.P161;

/**
 * Created by 96955 on 2019/1/12.
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Compsing[] compsings = {new Compsing(shared), new Compsing(shared), new Compsing(shared)
                , new Compsing(shared), new Compsing(shared), new Compsing(shared),};
        for (Compsing compsing : compsings) {
            compsing.dispose();
        }
    }

}

class Shared {
    private int refcount = 0;
    private static long count = 0;
    private final long id = count++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        refcount--;
        if (refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Compsing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Compsing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("dispose " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}
