package net.htwater.think.D14_10;

/**
 * Created by 96955 on 2019/6/16.
 */
public class Person {
    private String first;
    private String last;
    private String address;

    public Person() {
    }

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null{
        private NullPerson() {
            super("Null", "Null", "Null");
        }

        @Override
        public String toString() {
            return "NullPerson{}";
        }
    }

    public static final Person NULL=new NullPerson();

}
