package math;

import java.util.Scanner;

public class p10430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        input.close();
        
        if(a>=2 && a<=10000 && b>=2 && b<=10000 && c>=2 && c<=10000) {
            System.out.println((a+b)%c);
            System.out.println((a%c + b%c)%c);
            System.out.println((a*b)%c);
            System.out.println((a%c * b%c)%c);
        }
    }

}
