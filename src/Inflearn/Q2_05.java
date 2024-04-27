package Inflearn;

import java.util.Scanner;

public class Q2_05 {
    private static int solution1(int N){
        // 숫자 N을 입력받는다.
        // 2부터 N까지 반복하면서 for-loop을 도는 숫자가 소수인지 체크하고 해당 수부터 N까지의 곱에 해당하는
        // 숫자들은 반복문을 돌지 않도록한다.
        // 3도 마찬가지로 위와 같이 실행한다.
        int count = 0;
        int[] Arr = new int[N + 1];
        for(int i = 2; i <= N; i++){
            if(Arr[i] == 0) count++;
            for(int j = i; j <= N; j = j + i) Arr[j] = 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println(solution1(N));
    }
}
