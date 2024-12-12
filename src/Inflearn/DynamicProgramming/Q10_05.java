package Inflearn.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_05 {
    static int n, goal;
    static int[] dy;

    public static int solution(int[] arr){
        // 가장 큰 수 부터 차감해 본다.
        // 나누어 떨어지지 않는 경우 그 다음으로 큰 수로 해본다.
        // 그래도 안되면 첫번째 수를 하나 빼고
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = arr[i]; j <= goal; j++){
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }

        return dy[goal];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        goal = in.nextInt();
        dy = new int[goal + 1];
        System.out.println(solution(arr));
    }
}
