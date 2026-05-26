package OOPS;

public class Polymorphism {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism ob=new Polymorphism();
        System.out.println( ob.add(10,20));
        System.out.println(ob.add(10,20,30));
    }
}
