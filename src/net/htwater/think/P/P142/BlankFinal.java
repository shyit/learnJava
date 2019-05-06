package net.htwater.think.P.P142;

/**
 * Created by 96955 on 2019/1/3.
 */
public class BlankFinal {
    private final int i=0;
    private final int j;
    private final Poppet poppet;

    public BlankFinal(int j) {
        this.j = j;
        poppet=new Poppet(j);
    }

    public  BlankFinal(){
        j=1;
        poppet=new Poppet(1);
    }

    @Override
    public String toString() {
        return "j="+j;
    }

    public void sayHi(){
        System.out.println("j="+j);
    }

    public static void main(String[] args){
        System.out.println(new BlankFinal());
        System.out.println(new BlankFinal(47));
    }
}

class Poppet extends PoppetParent{
    private int i;

    public String togo() {
        return "i=";
    }

    Poppet(int i) {
        this.i = i;
    }
}

class PoppetParent{

    private final String togo() {
        return "j=";
    }

}

