package Inflearn.BFS;

import java.util.Scanner;

public class Q8_13 {

    private void BFS(){

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q8_13 main = new Q8_13();
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] board = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; i++){
                board[m][n] = in.nextInt();
            }
        }
        main.BFS();
    }
}
