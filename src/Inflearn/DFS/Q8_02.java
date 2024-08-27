package Inflearn.DFS;

import java.util.Scanner;

public class Q8_02 {
    static int c, n, answer, sum;
    static int[] arr;

    private void DFS(int sum, int L){
        if(sum > c) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            int num = arr[L];
            L = L + 1;
            DFS(sum + num, L);
            DFS(sum, L);
        }
    }

    public static void main(String[] args){
        Q8_02 main = new Q8_02();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        main.DFS(0, 0);
        System.out.println(answer);
    }
}
