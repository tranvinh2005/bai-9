package Lecture_8;
public class Bai8_27 {
    static class Calculation4{
         void sum(int a, long b){System.out.println(a+b);}
         void sum(int a, int b, int c){System.out.println(a+b+c);}
         public static void main(String args[]) {
             Calculation4 obj=new Calculation4();
             obj.sum(20, 20);
             obj.sum(20, 20, 20);
         }
     }
}
