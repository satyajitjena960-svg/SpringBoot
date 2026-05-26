package Array;

import java.util.Scanner;

public class PrimeNumberArray {
    int[] arr;
    PrimeNumberArray(int size){
        this.arr=new int[size];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
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
    public void printPrime(){

        for (int i=0;i< arr.length;i++){
            if (isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumberArray ob = new PrimeNumberArray(6);
        ob.insert();
        ob.printPrime();
    }
}
