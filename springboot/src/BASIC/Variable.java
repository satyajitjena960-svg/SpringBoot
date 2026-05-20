package BASIC;
public class Variable {
    int a;//instance variable
    static int b;//static variable
    public  void datatype(){
        int a=10;//local variable
        System.out.println(a);
        float b= 1.003F;
        System.out.println(b);
        double c=1.2;
        System.out.println(c);
        boolean d=true;
        System.out.println(d);
        char e='s';
        System.out.println(e);
        byte k=1;
        System.out.println(k);
        short h=2;
        System.out.println(h);
        long n=3;
        System.out.println(n);
    }
    public void size(){
        System.out.println("size of int = "+Integer.SIZE);
        System.out.println("Range of int = "+Integer.MIN_VALUE+"to"+Integer.MAX_VALUE);
        System.out.println("size of float = "+Float.SIZE);
        System.out.println("Range of flaot = "+Float.MIN_VALUE+"to"+Float.MAX_VALUE);
        System.out.println("size of double = "+Double.SIZE);
        System.out.println("Range of double = "+Double.MIN_VALUE+"to"+Double.MAX_VALUE);
        System.out.println("size of char = "+Character.SIZE);
        System.out.println("Range of char = "+Character.MIN_VALUE+"to"+Character.MAX_VALUE);
        System.out.println("size of byte = "+Byte.SIZE);
        System.out.println("Range of byte = "+Byte.MIN_VALUE+"to"+Byte.MAX_VALUE);
        System.out.println("size of long = "+Long.SIZE);
        System.out.println("Range of long = "+Long.MIN_VALUE+"to"+Long.MAX_VALUE);
        System.out.println("size of short = "+Short.SIZE);
        System.out.println("Range of short = "+Short.MIN_VALUE+"to"+Short.MAX_VALUE);
    }
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+"b = "+b);
    }
    public void swap_without3rdvariable(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+"b = "+b);
    }
    public static void main(String[] args) {
        Variable ob=new Variable();
        ob.datatype();
        ob.size();
        ob.swap(5,6);
        ob.swap_without3rdvariable(5,6);
    }
}
