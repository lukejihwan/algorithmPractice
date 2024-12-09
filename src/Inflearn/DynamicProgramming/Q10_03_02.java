package Inflearn.DynamicProgramming;

import java.util.Scanner;

public class Q10_03_02 {
    static int[] arr, answer;

    public static int solution(){

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            int sum = 0;
            for(int j = i; j >= 0; j--){
                if(arr[j] < x){
                    sum = Math.max(answer[j], sum);
                }

            }
            sum += 1;
            answer[i] = sum;
        }

        int max = 0;
        for(int i = 0; i < answer.length; i++){
            max = Math.max(max, answer[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n + 1];
        answer = new int[n + 1];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution());
    }
}
