package BASIC;

public class Largest {
    public void findLargest(int a,int b,int c){
        if (a<b && b<c){
            System.out.println(b+" Is greatest");
        } else if (a>b && a>c) {
            System.out.println(a+" is greatest");

        }
        else
            System.out.println(c+" is greatest");
    }

    public static void main(String[] args) {
        Largest ob=new Largest();
        ob.findLargest(1,2,3);
    }
}
