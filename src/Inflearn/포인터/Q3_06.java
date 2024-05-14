package Inflearn.포인터;

import java.util.Scanner;

public class Q3_06 {
    private static int solution1(){}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

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
        System.out.println();
        System.out.println(max);
    }
}
