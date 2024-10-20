package Inflearn.DFS;

import java.util.Scanner;

public class Q8_03 {
    static int m, n, answer, timeSum;
    static int[] scores, times, names;
    static String name;

    private void DFS(int sum, int L, int timeSum){
        if(timeSum > m)return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(sum + scores[L], L + 1, timeSum + times[L]);
            DFS(sum, L + 1, timeSum);
        }

    }

    public static void main(String[] args) {
        Q8_03 main = new Q8_03();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        scores = new int[n];
        times = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = in.nextInt();
            times[i] = in.nextInt();
        }

        int L = 0; //level
        int sum = 0; // 총합 점수
        timeSum = 0;
        main.DFS(sum, L, timeSum);
        System.out.println(answer);
    }
}
