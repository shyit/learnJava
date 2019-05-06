package net.htwater.think.D12_05;

/**
 * Created by cambrian on 2019/5/5.
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Sneeze");
            sneeze.printStackTrace();
        } catch (Annoyance annoyance) {
            System.out.println("Annoyance");
            annoyance.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        try {
            throw new Sneeze();
        } catch (Annoyance annoyance) {
            System.out.println("Annoyance");
            annoyance.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        try {
            throw new Sneeze();
        }  catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}

class Annoyance extends Exception {

}

class Sneeze extends Annoyance {

}
