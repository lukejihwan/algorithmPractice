package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_04 {
    private static int[] fibo;

    private static int DFS(int n){
        if(fibo[n] > 0) return fibo[n];
        if(n == 1){
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        }else{
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        // 피보나치 수열(메모이제이션)
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        fibo = new int[N + 1];

        DFS(N);
        for(int i = 1; i < fibo.length; i++){
            System.out.print(fibo[i] + " ");
        }

    }
}
