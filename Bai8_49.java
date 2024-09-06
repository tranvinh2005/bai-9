package Lecture_8;

public class Bai8_49 {

    int id;
    String name;

    Bai8_49(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        Bai8_49 s1 = new Bai8_49(111,"Karan");
        Bai8_49 s2 = new Bai8_49(321,"Aryan");
        s1.display();
        s2.display();
    }
}
