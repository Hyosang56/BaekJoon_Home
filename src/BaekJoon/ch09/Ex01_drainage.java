package BaekJoon.ch09;

import java.io.*;
import java.util.StringTokenizer;

public class Ex01_drainage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                bw.flush();
                break;
            }
            if (a > b) {
                if (a % b == 0) {
                    bw.write("multiple");
                } else {
                    bw.write("neither");
                }
            } else {
                if (b % a == 0) {
                    bw.write("factor");
                } else {
                    bw.write("neither");
                }
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
