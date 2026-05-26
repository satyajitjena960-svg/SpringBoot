package OOPS;
class Bank{
    public  double intrest(int amount){
        double intrest=amount*((double) 15 /100);
        return intrest;
    }
}
class RBI extends Bank{
    public  double intrest(int amount){
        double intrest=amount*((double) 18 /100);
        return intrest;
    }
}
class SBI extends Bank{
    public  double intrest(int amount){
        double intrest=amount*((double) 7 /100);
        return intrest;
    }
}
class PNB extends Bank{
    public  double intrest(int amount){
        double intrest=amount*((double) 13 /100);
        return intrest;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bank a;
        a=new SBI();
        System.out.println(a.intrest(5000));

        a=new RBI();
        System.out.println(a.intrest(5000));

        a=new PNB();
        System.out.println(a.intrest(5000));
    }
}
