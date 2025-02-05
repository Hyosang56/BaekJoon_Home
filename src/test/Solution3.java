package test;

public class Solution3 {

    public void solution(int x, int y){
        int money1k = 0, money5k=0, money10k=0;
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <x-i ; j++) {
                int k = x - i - j;

                if((i*10000 + j*5000 + k*1000) == y){
                    money10k = i;
                    money5k = j;
                    money1k = k;
                    System.out.println("1000원: "+money1k+"명, 5000원: "+ money5k + "명, 10000원: " + money10k + "명");
                    return;
                }
            }
        }

        System.out.println("유효한 조합이 없습니다.");
    }

    public static void main(String[] args) {
        int x = 11;
        int y = 50000;
        Solution3 sol = new Solution3();
        sol.solution(x,y);
    }



}
