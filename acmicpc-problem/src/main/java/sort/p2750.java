package sort;

import java.util.Scanner;

public class p2750 {
    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int aux = i-1;
            while((aux >=0) && (arr[aux] > tmp)) {
                arr[aux+1] = arr[aux];
                aux--;
            }
            arr[aux+1] = tmp;
        }
        return arr;
    }

    public static void printSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        input.close();
        
        // 삽입정렬
        arr = insertionSort(arr);
        
        // 꿀팁 : Java 상에서는 아래와 같이 간단한 메서드를 호출 해 주면 오름차순으로 자동 정렬됨
        //Arrays.sort(arr);
        
        // 출력
        printSort(arr);
    }
}
