package Inflearn.그리디;

import java.util.Scanner;

public class Q9_06 {
    static int[] unf;

    public static int Find(int v){

    }

    public static void Union(int a, int b){

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        unf = new int[n + 1];
        for(int i = 1; i <= n; i++) unf[i] = i;
        for(int i = 1; i <= m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            Union(a, b);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int fa = Find(a);

    }
}
