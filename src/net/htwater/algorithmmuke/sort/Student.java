package net.htwater.algorithmmuke.sort;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return this.name.equals(student.name);
    }


    @Override
    public int compareTo(Student anotherStudent) {
        if (this.getAge() < anotherStudent.getAge()) {
            return -1;
        }
        if (this.getAge() == anotherStudent.getAge()) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
