package BaekJoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08_ThreeStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());
        a[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        while (a[2] >= a[0] + a[1]){
            a[2] -= 1;
        }
        System.out.println(a[0]+a[1]+a[2]);
    }
}