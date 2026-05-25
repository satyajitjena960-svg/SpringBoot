package Array;

import java.util.Scanner;

public class PrintIndexValue {
    int[] arr;
    PrintIndexValue(int size){
        this.arr=new int[size];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void evenIndex(){
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public void oddIndex(){
        for (int i=0;i<arr.length;i++){
            if (i%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public void evenAndOddElement(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
            else
                System.out.println();
            System.out.print(" "+arr[i]);
        }
    }
    public int sum(){
        int sum=0;
        for (int i=0;i<arr.length;i++){
             sum+=arr[i];
        }
        return sum;
    }
    public void sumEvenOddIndex(){
        int sum=0;
        int sum2=0;
        for (int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
            else
                sum2+=arr[i];
        }
        System.out.println("sum of even index "+sum);
        System.out.println("sum of odd index "+sum2);
    }
    public void SumEvenOddElement(){
        int sum=0;
        int sum2=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
            else
                sum2+=arr[i];
        }
        System.out.println("sum of even index "+sum);
        System.out.println("sum of odd index "+sum2);
    }

    public static void main(String[] args) {
        PrintIndexValue ob = new PrintIndexValue(6);
        ob.insert();
        ob.evenIndex();
        ob.oddIndex();
        ob.evenAndOddElement();
        System.out.println(ob.sum());
        ob.sumEvenOddIndex();
        ob.SumEvenOddElement();
    }


}
