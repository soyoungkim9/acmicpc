package AB;

import java.util.Scanner;

public class p10950 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a, b;
        
        n = sc.nextInt();
        while(n>0) {
          a = sc.nextInt();
          b = sc.nextInt();
          System.out.println(a+b);
          n--;
        }
        
        sc.close();
      }
}
