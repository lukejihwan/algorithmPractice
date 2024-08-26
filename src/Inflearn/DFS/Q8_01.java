package Inflearn.DFS;

import java.util.Scanner;

public class Q8_01 {
    static int n, total;
    static String answer = "NO";
    static int[] arr;

    public static String DFS(int L, int sum, boolean flag){
        if(n == L){
            if((total - sum) == sum){
                return answer = "YES";
            }
        }else{
            DFS(L + 1, sum + arr[L], true);
            DFS(L + 1, sum + arr[L], false);
        }

    }
    public static void main(String[] args) {
        Q8_01 main = new Q8_01();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = in.nextInt();
            total += arr[i];
        }
d
        DFS(0, 0, true);
    }
}
