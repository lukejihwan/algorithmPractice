package Inflearn.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_09 {

    private static int count(int[] arr, int mid){
        int count = 1; // 여기는 왜 처음부터 1이지?
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] > mid){
                count++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }

        return count;
    }

    private static int solution1(int[] arr, int N, int K){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= K){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution1(arr, N, K));
    }

}
