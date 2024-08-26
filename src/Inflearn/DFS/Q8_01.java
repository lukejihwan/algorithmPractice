package Inflearn.DFS;

import java.util.Scanner;

public class Q8_01 {
    static int n, total = 0;
    static String answer = "NO";
    static int[] arr;
    static boolean flag = false;

    public void DFS(int L, int sum, int[] arr){
        if(n == L){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
                return;
            }
        }else{
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
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
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
