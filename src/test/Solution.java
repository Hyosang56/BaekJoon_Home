package test;

public class Solution {
    // 반복문 사용
    public int solution1(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
    // 수학공식 사용
    public int solution2(int n){
        return n * (n+1) /2;
    }
    //재귀호출 사용
    public int solution3(int n){
        if(n == 1) return 1;
        return n + solution3(n-1);
    }

    public static void main(String[] args)
    {
        Solution sol = new Solution();

        // 인자 값은 지원자가 적절하게 수정하여 제출
        System.out.println(sol.solution1(5));
        System.out.println(sol.solution2(3));
        System.out.println(sol.solution3(10));
    }
}
