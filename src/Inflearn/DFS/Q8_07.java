package Inflearn.DFS;

import java.util.Scanner;

public class Q8_07 {
    static int answer;

    private void DFS(int n, int m){
        if(m == 0 || n == m){
            answer++;
            return;
        }else{
            DFS(n - 1, m - 1);
            DFS(n - 1, m);
        }
    }
    public static void main(String[] args) {
        Q8_07 main = new Q8_07();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        main.DFS(n, m);
        System.out.println(answer);
    }
}
