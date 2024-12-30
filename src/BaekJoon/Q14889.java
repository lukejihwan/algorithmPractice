package BaekJoon;

import java.util.Scanner;

public class Q14889 {
    static int[][] board;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        board = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = in.nextInt();
            }
        }

        // 언제 두 팀의 능력차가 가장 적은지 구해야 함
        // todo 조합 알고리즘에 대해 공부해야함!!


    }

    public static int solution(){

        return 0;
    }


}
