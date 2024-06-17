package Inflearn.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_10 {

    private static int count(int[] arr, int mid){
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - ep >= mid){
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[N - 1];

        int answer = 0;
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= K){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
