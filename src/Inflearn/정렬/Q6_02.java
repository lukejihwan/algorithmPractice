package Inflearn.정렬;

import java.util.Scanner;

public class Q6_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < N - 1; i++){
            for(int j = 0; j < N - i - 1; j++){
                int num = arr[j];
                if(num > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = num;
                    arr[j] = temp;
                }
            }
        }
        for(int answer : arr){
            System.out.print(answer + " ");
        }

        return ;
    }
}
