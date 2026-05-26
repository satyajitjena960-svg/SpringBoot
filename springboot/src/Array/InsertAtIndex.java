package Array;

import java.util.Scanner;

public class InsertAtIndex {
    int[]arr;
    InsertAtIndex(int size){
        this.arr=new int[size];
    }
    Scanner sc = new Scanner(System.in);
    public void insertAtEvenindex(){
        for (int i=0;i< arr.length;i++){
            if(i%2==0){
                arr[i]=sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        InsertAtIndex ob=new InsertAtIndex(10);
        ob.insertAtEvenindex();
    }
}
