package Array;

import java.util.Scanner;

public class CharArray {
    char[]arr;
    CharArray(int size){
        this.arr=new char[size];
    }
    public void reverse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter charecters");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("reverse is : ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        CharArray ob=new CharArray(10);
        ob.reverse();
    }
}
