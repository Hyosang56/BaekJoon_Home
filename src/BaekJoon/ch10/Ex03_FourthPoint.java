package BaekJoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

public class Ex03_FourthPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());
        if(x1 == x2){
            bw.write(Integer.toString(x3));
        } else if (x2 == x3) {
            bw.write(Integer.toString(x1));
        } else{
            bw.write(Integer.toString(x2));
        }
        if(y1 == y2){
            bw.write(" "+y3);
        } else if (y2 == y3) {
            bw.write(" "+y1);
        } else{
            bw.write(" "+y2);
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
