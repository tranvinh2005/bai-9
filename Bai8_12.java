package Lecture_8;

public class Bai8_12 {

    static class Student {  // Make Student static
        int id;
        String name;
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.id + " " + s1.name);
    }
}
