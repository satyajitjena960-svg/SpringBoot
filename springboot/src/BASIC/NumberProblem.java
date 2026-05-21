package BASIC;

public class NumberProblem {
    public int reverse(int a){
        int num=a;
        int reverse=0;
        while (num!=0){
            int reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        return reverse;
    }
    public Boolean isPalendrom(int a){
        if(a==reverse(a)){
            return true;
        }
        return false;
    }
    public int countDigit(int a){
        int num=a;
        int count=0;
        while (num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    public boolean isArmstrong(int a){
        int sum=0;
        int num=a;
        while (num!=0){
            int reminder=num%10;
            sum=sum+reminder*reminder*reminder;
            num=num/10;

        }
        if (sum==a){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NumberProblem ob=new NumberProblem();
       int y= ob.reverse(127);
        System.out.println(y);
        boolean z=ob.isPalendrom(123);
        System.out.println(z);
        int k=ob.countDigit(1234);
        System.out.println(k);
        boolean a=ob.isArmstrong(153);
        System.out.println(a);
    }
}
