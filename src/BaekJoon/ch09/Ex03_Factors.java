package BaekJoon.ch09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex03_Factors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n == -1) break;

            List<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for(int i=1; i<n; i++){
                if(n % i == 0){
                    divisors.add(i);
                    sum += i;
                }
            }
            if(n == sum){
                bw.write(n+" = "+formatDivisors(divisors));
            } else {
                bw.write(n+" is NOT perfect.");
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static String formatDivisors(List<Integer> divisors) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< divisors.size(); i++){
            sb.append(divisors.get(i));
            if(i<divisors.size() -1){
                sb.append(" + ");
            }
        }
        return sb.toString();
    }
}
