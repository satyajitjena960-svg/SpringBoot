package BASIC;

public class Number {
    public boolean isNeon(int num){
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }


        if (sum==num){
            return true;
        }
        return false;
    }
    public  boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        if (sum == product) {
            return true;
        } else
            return false;
    }
    public boolean isPrime(int num){
        int flag=0;
        if(num<2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if (num%i==0){
                flag=1;
            }
        }
        if (flag!=0)
            return false;
        else
            return true;
    }
    public void allPrime(int num){
        for (int i=0;i<=num;i++){
            if (isPrime(i)){
                System.out.print(" "+i);
            }
        }
    }
    public void fibonacci(int num){
        int a=0;
        int b=1;
        int sum=0;
        if (num >= 1) {
            System.out.print(a);
        }
        if (num >= 2) {
            System.out.print(" " + b);
        }
        for(int i=1;i<num-1;i++){
            sum=a+b;
            if(sum>num)
                break;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }

    }
    public boolean isPerfectNumber(int num) {
        if (num <= 1)
            return false;
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public boolean isStrongNumber(int num) {
        if (num < 0) return false; // Strong numbers are non-negative
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }
    public boolean isDuckNumber(String number) {

        if (number.charAt(0) == '0') {
            return false;
        }
        return number.contains("0");
    }
    public int gcd(int a,int b){
        if(b==0)
            return Math.abs(a);
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Number ob=new Number();
       boolean a = ob.isPrime(23);
        System.out.println(a);
        ob.allPrime(100);
        ob.fibonacci(100);
        System.out.println(ob.isDuckNumber("11098"));
        System.out.println(ob.isNeon(1234));
        System.out.println(ob.isSpy(154));
        System.out.println(ob.factorial(156));
        System.out.println(ob.isPerfectNumber(666));
        System.out.println(ob.isStrongNumber(456));
        System.out.println(ob.gcd(54,24));
    }

}
