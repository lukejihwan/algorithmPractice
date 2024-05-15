package Inflearn.포인터;

import java.util.Scanner;

public class Q3_06 {
    private static int solution1(int[] arr, int N, int K){
        int answer = 0;

        int rl = 0, count = 0, rt = 0, changeable = K, max = 0;
        while(rt < N){
            if(arr[rt] == 1){
                count++;
                rt++;
            }else if(arr[rt] == 0 && changeable > 0){
                count++;
                if((K - changeable) == 1) rl = rt;
                changeable--;
                rt++;
            }else if(arr[rt] == 0 && changeable == 0){
                max = Math.max(max, count);
                changeable = K;
                count = 0;
                rt = rl;
            }

        }

        return answer;
    }

    private static int solution2(int[] arr, int N, int K){

        // rt가 K를 초과하는 만큼 0을 1로 바꿀 때 연속된 1의 갯수를 센다.

        int lt = 0, rt = 0, max = 0, count = 0;

        while (rt < N){
            if(arr[rt] == 0){
                count++;
            }

            while (count > K){
                if(arr[lt] == 0) count--;
                lt++;
            }
            max = Math.max(max, rt - lt + 1);
            rt++;
        }


        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution1(arr, N, K));
        System.out.println(solution2(arr, N, K));

    }
}
