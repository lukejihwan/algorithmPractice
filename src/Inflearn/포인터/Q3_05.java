package Inflearn.포인터;

import java.util.Scanner;

public class Q3_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }

        int sum = 0, pf = 0, count = 0;
        for(int pe = 0; pe < N - 1; pe++){
            sum += arr[pe];
            if(sum == N)count++;
            while(sum >= N){
                sum -= arr[pf++];
                if(sum == N)count++;
            }
        }

        System.out.println(count);
    }
}
