package AB;

import java.util.Scanner;

public class p10953 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < cnt; i++) {
          String num = sc.nextLine();
          String[] arr = num.split(",");
          System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
        
        sc.close();
      }
}
