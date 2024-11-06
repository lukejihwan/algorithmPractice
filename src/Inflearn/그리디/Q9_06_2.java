package Inflearn.그리디;

import java.util.Scanner;

public class Q9_06_2 {
    static int[] unf;
    static float[] unff;

    public static int Find(int v){
        if(unf[v] == v){
            return v;
        }else{
            return unf[v] = Find(unf[v]);
        }
    }

    public static void Union(int a, int b){
        int af = Find(a);
        int bf = Find(b);
        if(af != bf) unf[af] = bf;
    }

    // 다시풀어보기
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
        int ax = Find(in.nextInt());
        int bx = Find(in.nextInt());
        if(ax == bx)System.out.println("YES");
        else System.out.println("NO");
    }
}
