package Lecture_8;

public class Bai8_52 {

    int id;
    String name;
    Bai8_52() {System.out.println("default constructor is invoked");}

    Bai8_52(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Bai8_52 e1 = new Bai8_52(111, "Karan");
        Bai8_52 e2 = new Bai8_52(222, "Aryan");        
        e1.display();
        e2.display();
    }
}
