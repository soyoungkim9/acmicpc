package sort;

import java.util.Scanner;

public class p2947 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                    
                    for(int sort : arr) {
                        System.out.print(sort + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
