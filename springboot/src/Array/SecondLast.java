package Array;

import java.util.Scanner;

public class SecondLast {
    int[] arr;
    SecondLast(int size){
        this.arr=new int[size];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void secondLastElement(){
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            for (int i:arr){
                if (i>max1){
                    max2=max1;
                    max1=i;
                } else if (i>max2 && i!=max1) {
                    max2=i;
                }
            }
            System.out.println(max2);

    }

    public static void main(String[] args) {
        SecondLast ob = new SecondLast(6);
        ob.insert();
        ob.secondLastElement();
    }
}
