package Inflearn.정렬;

import java.util.Scanner;

public class Q6_01 {
    private static int[] solution1(int[] arr, int N){
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

        return arr;
    }

    private static int[] solution2(int[] arr, int N){
        for(int i = 0; i < N - 1; i++){
            int idx = i;
            for(int j = i + 1; j < N; j++){
                if(arr[idx] > arr[j]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
            arr2[i] = arr[i];
        }

        for(int answer : solution1(arr, N)){
            System.out.print(answer + " ");
        }

        System.out.println();

        for(int K : solution2(arr2, N)){
            System.out.print(K + " ");
        }
    }
}
