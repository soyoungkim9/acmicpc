package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9613 {
    public static long getGCD(long a, long b) {
        return (b == 0) ? a : getGCD(b, a%b);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                      new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr;
        int size;
        long sum;
        if(t>=1 && t<=100) {
            while(t-- > 0) {
                // 한줄씩 입력받은 값들을 배열 각 자리에 넣는다.
                StringTokenizer st = new StringTokenizer(br.readLine());
                size = Integer.parseInt(st.nextToken());
                if(size <= 100) {
                    /* 각 테스트 케이스는 수의 개수 size만큼 배열 생성 */
                    arr = new int[size];
                    for(int i = 0; i < size; i++) {
                           arr[i] = Integer.parseInt(st.nextToken());
                    }
                    
                    // gcd의 합 계산
                    sum = 0;
                    for(int i = 0; i < size-1; i++) {
                        for(int j = i+1; j < size; j++) {
                            sum += getGCD(arr[i], arr[j]);
                        }
                    }
                    System.out.println(sum);
                }
            }
        }
    }

}
