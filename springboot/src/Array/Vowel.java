package Array;

import java.util.Scanner;

public class Vowel {
    char[]arr;
    Vowel(int size){
        this.arr=new char[size];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
    }
    public void findVowel(){
        for(int i=0;i< arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='0' || arr[i]=='u'){
                System.out.println(arr[i]);
            }
            if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Vowel ob = new Vowel(6);
        ob.insert();
        ob.findVowel();
    }
}
