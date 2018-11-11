package math;

import java.util.Scanner;

public class p2609 {
    public static int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
    
    public static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        input.close();
        if(a>0 || a<10000 || b>0 || b<10000) {
            if(a >= b) {
                System.out.println(gcd(a, b));
                System.out.println(lcm(a, b));
            }else {
                System.out.println(gcd(b, a));
                System.out.println(lcm(b, a));
            }
        }
    }

}
