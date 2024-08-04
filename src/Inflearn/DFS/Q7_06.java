package Inflearn.DFS;

import java.util.Scanner;

public class Q7_06 {
    static int n;
    static int[] ch;
    static int[] str;

    public static void DFS(int N){
        if(N == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.print(tmp);
        }else{
            ch[N] = 1;
            DFS(N + 1);
            ch[N] = 0;
            DFS(N + 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        DFS(N);
    }
}

