package BaekJoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex07_TriangleThreeSide {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[3];
            a[0] = Integer.parseInt(st.nextToken());
            a[1] = Integer.parseInt(st.nextToken());
            a[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(a);
            if(a[0]==0 && a[1]==0 && a[2]==0) break;
            if(a[2] < a[0]+a[1]){
                if(a[0]==a[1] && a[1]==a[2]) System.out.println("Equilateral ");
                else if (a[0]==a[1] || a[1]==a[2] || a[2]==a[0]) System.out.println("Isosceles");
                else System.out.println("Scalene ");
            } else System.out.println("Invalid");
        }
    }
}
