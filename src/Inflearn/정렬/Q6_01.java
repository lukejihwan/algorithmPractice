package Inflearn.정렬;

import java.util.Scanner;

public class Q6_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < N - 1; i++){
            int goal = arr[i];
            int min = Integer.MAX_VALUE;
            int index = Integer.MIN_VALUE;
            for(int j = i + 1; j < N; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if(goal > min){
                arr[i] = min;
                arr[index] = goal;
            }
        }

        for(int K : arr){
            System.out.print(K + " ");
        }
    }
}
