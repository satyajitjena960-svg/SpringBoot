package BASIC;

public class Swap {
    public void swapWithV(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+" b = "+b);
    }
    public void swapWithoutV(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+" b = "+b);
    }

    public static void main(String[] args) {
        Swap ob=new Swap();
        ob.swapWithoutV(2,3);
        ob.swapWithV(2,3);
    }

}
