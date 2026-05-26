package Array;

import java.util.Scanner;

public class Square {
    int[]arr;
    Square(int size){
        this.arr=new int[size];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void squareOfElements(){
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public void show(){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Square ob = new Square(5);
        ob.insert();
        ob.squareOfElements();
        ob.show();
    }
}
