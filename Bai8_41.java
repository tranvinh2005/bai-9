package Lecture_8;

public class Bai8_41 {

    int id;
    String name;

    Bai8_41(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        Bai8_41 s1 = new Bai8_41(111,"Karan");
        Bai8_41 s2 = new Bai8_41(222,"Aryan");
        s1.display();
        s2.display();
    }
}
