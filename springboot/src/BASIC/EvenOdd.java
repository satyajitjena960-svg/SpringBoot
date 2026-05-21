package BASIC;

public class EvenOdd {
    public void evenOdd(int a){
        if (a%2==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        EvenOdd ob=new EvenOdd();
        ob.evenOdd(3);
    }
}
