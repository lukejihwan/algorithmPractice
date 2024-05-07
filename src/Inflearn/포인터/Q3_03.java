package Inflearn.포인터;

import java.util.Scanner;

public class Q3_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        int max = 0, sum, index=0;
        for(int i = 0; i < K; i++) max += arr[i];
        sum = max;

        // 계속 더하게 되면 time limit을 초과하게 되므로, 원래 더했던 숫자에 처음값만 빼고 맨 뒤에 값만 더하는 식으로 하면
        // 매번 더할 필요가 없게 된다.
        while(index < N - K){
            sum += (arr[index + K] - arr[index]);
            max = Math.max(max, sum);
            index++;
        }

        System.out.println(max);
    }
}
