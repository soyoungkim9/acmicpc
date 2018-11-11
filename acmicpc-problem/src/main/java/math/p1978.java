package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1978 {
    public static boolean isPrime(int n){
        
        if(n <= 1) return false; 
        
        if(n != 2 && n%2 == 0) return false;
        
        for(int i = 3; i*i <=n; i+=2) { 
            if(n%i == 0) return false; 
        }
        
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        if(num <= 100) {
            String[] st = br.readLine().split(" ");
            for(int i = 0; i < num; i++) {
                int x = Integer.parseInt(st[i]);
                if(x <= 1000) {
                    if(isPrime(x)) ++cnt;
                }
            }
        }
        
        br.close();
        System.out.println(cnt);
                
    }

}
