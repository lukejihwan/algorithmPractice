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

        int max = 0;
        int index = 0;
        while(index < N - K + 1){
            int sum = 0;
            for(int i = index; i < index + K; i++){
                sum += arr[i];
            }
            if(max < sum)max = sum;
            index++;
        }

        System.out.println(max);
    }
}
