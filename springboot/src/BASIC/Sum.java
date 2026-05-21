package BASIC;

public class Sum {
    public int sumOfDigits(int a){
        int sum=0;
        int num=a;
        while (num!=0){
            int reminder=num%10;
            sum=sum+reminder;
            num=num/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Sum ob=new Sum();
       int x= ob.sumOfDigits(786);
        System.out.println(x);
    }
}
