package Inflearn.DFS;

import java.util.Scanner;

public class Q8_07 {
    static int[][] hint;

    private int DFS(int n, int m){
        if(hint[n][m] != 0) return hint[n][m];
        if(m == 0 || n == m){
            return 1;
        }else{
            return hint[n][m] = DFS(n - 1, m - 1) + DFS(n - 1, m);
        }
    }
    public static void main(String[] args) {
        Q8_07 main = new Q8_07();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        hint = new int[n + 1][m + 1];
        System.out.println(main.DFS(n, m));
    }
}
