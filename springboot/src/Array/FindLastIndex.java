package Array;

import java.util.Scanner;

public class FindLastIndex {
    int[] arr;

    FindLastIndex(int size) {
        this.arr = new int[size];
    }

    Scanner sc = new Scanner(System.in);

    public void insert() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int findLastIndex(int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindLastIndex ob = new FindLastIndex(10);
        ob.insert();
        int lastIndex = ob.findLastIndex(9);
        System.out.println(lastIndex);

    }
}

