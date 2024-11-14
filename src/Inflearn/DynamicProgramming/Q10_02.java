package Inflearn.DynamicProgramming;

import java.util.Scanner;

public class Q10_02 {
    static int[] arr;
    static int a, d;

    private int solution(int n){
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3; i <= n + 1; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n + 1];
    }

    public static void main(String[] args) {
        Q10_02 main = new Q10_02();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n + 2];

        System.out.println(main.solution(n));
    }
}
