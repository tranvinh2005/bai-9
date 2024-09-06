package Lecture_8;

public class Bai8_48 {

    int id;
    String name;

    Bai8_48(int id, String name) {
        id = id;
        name = name;
    }

    void display() {
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        Bai8_48 s1 = new Bai8_48(111,"Karan");
        Bai8_48 s2 = new Bai8_48(321,"Aryan");
        s1.display();
        s2.display();
    }
}
