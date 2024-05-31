package Inflearn.정렬;

import java.util.Scanner;

public class Q6_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 1; i < N; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int num : arr) System.out.print(num + " ");
        return ;
    }
}
