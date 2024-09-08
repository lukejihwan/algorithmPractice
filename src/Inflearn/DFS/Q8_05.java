package Inflearn.DFS;

import java.util.Scanner;

public class Q8_05 {
    static int n, m, ea;
    static int answer = 9999999;
    static int[] coins;

    private void DFS(int sum, int ea){
        if(sum == m){
            if(ea < answer) answer = ea;
        }else{
            for(int i = 0; i < n; i++){
                DFS(sum + coins[i], ea + 1);
            }
        }

    }

    public static void main(String[] args){
        Q8_05 main = new Q8_05();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = in.nextInt();
        }
        m = in.nextInt();
        int sum = 0;
        main.DFS(sum, 0);
        System.out.println(answer);
    }
}
