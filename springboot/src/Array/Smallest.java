package Array;

import java.util.Scanner;

public class Smallest {
        int[]arr;
        Smallest(int size){
            this.arr=new int[size];
        }
        Scanner sc=new Scanner(System.in);
        public void insert(){
            for(int i=0;i< arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        public void findTheSmallest(){
            int smallest=arr[0];
            for (int i=0;i< arr.length;i++){
                if(arr[i]<smallest){
                    smallest=arr[i];
                }
            }
            System.out.println(smallest);
        }
        public void secondSmallest(){
            Integer smallest = null;
            Integer secondSmallest = null;

            for (int num : arr) {
                if (smallest == null || num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num != smallest && (secondSmallest == null || num < secondSmallest)) {
                    secondSmallest = num;
                }
            }
            System.out.println(secondSmallest);
        }
        public static void main(String[] args) {
            Smallest ob = new Smallest(6);
            ob.insert();
            ob.findTheSmallest();
            ob.secondSmallest();
        }


}
