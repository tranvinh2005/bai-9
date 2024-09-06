package Lecture_8;

public class Bai8_54 {
    void m() {System.out.println("method is invoked");}
    void n() {this.m();}
    void p() {n();}

    public static void main(String args[]) {
        Bai8_54 s1 = new Bai8_54();
        s1.p();
    }
}
