package BASIC;

//import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Armstrong {
    public void FindArmstrong(double x) {
//        int x;
        double num=x;
        double k=countDigit(x);
        int y;
        double sum = 0;
        double lastdigit = 0;
       while(x!=0){

            lastdigit = num % 10;
            sum = sum +Math.pow(num,k);
            num = num / 10;

        }
        if (sum == num) {
            System.out.println("this is a arm strong no ");
        }
        System.out.println("not armstrong");

    }
    public double countDigit(double a){
        double num=a;
        double count=0;
        while (num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Armstrong ob=new Armstrong();
        ob.FindArmstrong(153);
    }
}
