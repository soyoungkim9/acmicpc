package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1934 {
    public static int getGCD(int a, int b) {
        return (a%b == 0) ? b : getGCD(b, a%b); 
    }
    
    public static int getLCM(int a, int b) {
        return a*b / getGCD(a, b);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        if(t>=1 && t<=1000) {
            while(t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());    
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a>=1 && a <=45000 && b>=1 && b <=45000) 
                    System.out.println(getLCM(a,b));
            }
        }
    }

}
