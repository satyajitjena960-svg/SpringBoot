package Array;

import java.util.Scanner;

public class NumberOfZero {
    int[]arr;
    NumberOfZero(int size){
        this.arr=new int[size];
    }
    Scanner sc = new Scanner(System.in);
    public void insert(){
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    public int findZeros(){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfZero ob = new NumberOfZero(7);
        ob.insert();
        System.out.println(ob.findZeros());
    }
}
