package Inflearn.DFS;

import java.util.Scanner;

public class Q8_09 {
    static int[] answer;
    static int n, m;

    private void DFS(int L, int start){
        if(L == m){
            for(int x : answer)System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = start; i <= n; i++){
                answer[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Q8_09 main = new Q8_09();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        answer = new int[m];
        main.DFS(0, 1);
    }
}
