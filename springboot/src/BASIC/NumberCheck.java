package BASIC;

public class NumberCheck {
    public void check(int a){
        if (a>0){
            System.out.println("Positive");
        } else if (a<0) {
            System.out.println("Negative");
        }
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        NumberCheck ob=new NumberCheck();
        ob.check(2);
    }
}
