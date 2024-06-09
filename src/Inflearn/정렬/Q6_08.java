package Inflearn.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        while (true) {
            int mid = (start + end) / 2;

            if (arr[mid] == K) {
                System.out.println(mid + 1);
                break;
            }else if(arr[mid] < K){
                start = mid + 1;
            }else if(arr[mid] > K){
                end = mid - 1;
            }
        }

    }
}
