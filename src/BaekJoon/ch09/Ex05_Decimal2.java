package BaekJoon.ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex05_Decimal2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> dec = new ArrayList<>();
        for (int i = m; i <=n ; i++) {
            if(isPrime(i)){
                dec.add(i);
                sum += i;
            }
        }
        if(dec.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(dec.get(0));
        }
    }

    public static boolean isPrime(int n){
        if (n <=1) return false;
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
