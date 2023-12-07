package ua.hillel.fedorchenko.lessons.lesson4;

public class Homework5 {
    public static void main (String[] args) {
        String li = "Лі:";
        String min ="Мінь:";
        int a= 13;
        int b = 24;
        int c = 46;
        int d = 9;
        int e = 35;
        int f = 12;
        double k = 1.5;
        int quantity = 860;
        double quantity2 = quantity*k;
        int liarmy = a*quantity + b*quantity + c*quantity;
        double minarmy = d*quantity2 + e*quantity2 + f*quantity2;
        System.out.println(li + liarmy);
        System.out.println(min + (int)minarmy);
        }
}
