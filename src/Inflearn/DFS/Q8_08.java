package Inflearn.DFS;

import java.util.Scanner;

public class Q8_08 {
    static int[] binomial, p, ch;
    static int n, f;
    static boolean flag = false;

    private int initialize(int n, int m)
    {
        if(m == 0 || n == m){
            return 1;
        }else{
            return initialize(n - 1, m) + initialize(n - 1, m - 1);
        }
    }

    private void DFS(int L, int sum){
        if(flag) return;
        if(n == L){
            if(sum == f){
                for(int x : p)System.out.print(x + " ");
                flag = true;
            }
        }else{
            for(int i = 1; i <= n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * binomial[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q8_08 main = new Q8_08();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        binomial = new int[n];
        ch = new int[n + 1];
        p = new int[n];
        for(int i = 0; i < n; i++){
            binomial[i] = main.initialize(n - 1, i);
        }
        main.DFS(0, 0);
    }
}
