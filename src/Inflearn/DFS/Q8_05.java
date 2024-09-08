package Inflearn.DFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q8_05 {
    static int n, m, ea;
    static int answer = Integer.MAX_VALUE;
    static Integer[] coins;

    private void DFS(int sum, int ea){
        if(ea > answer) return;
        if(sum == m) {
            if (ea < answer) answer = ea;
        } else if (sum > m) {
            return;
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

        coins = new Integer[n];
        for(int i = 0; i < n; i++){
            coins[i] = in.nextInt();
        }
        m = in.nextInt();
        Arrays.sort(coins, Collections.reverseOrder());
        int sum = 0;
        main.DFS(sum, 0);
        System.out.println(answer);
    }
}
