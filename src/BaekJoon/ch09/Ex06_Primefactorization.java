package BaekJoon.ch09;

import java.io.*;

public class Ex06_Primefactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while(n > 1){
            for (int i = 2; i <=n ; i++) {
                if (n % i == 0) {
                    bw.write(Integer.toString(i));
                    bw.newLine();
                    n /= i;
                    break;
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
