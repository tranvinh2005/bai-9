package Lecture_8;

public class Bai8_21 {

    static class Calculation2 {

        void sum(int a, int b) {System.out.println(a + b);}

        void sum(double a, double b) {System.out.println(a + b);}
        
        public static void main(String args[]) {
            Calculation2 obj= new Calculation2();
            obj.sum(10.5, 10.5);
            obj.sum(20, 20);
        }
    }
}
