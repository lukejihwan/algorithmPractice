package Inflearn.스택;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q5_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] board = new int[N + 1][N + 1];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        int[] moves = new int[K];
        for(int i = 0; i < K; i++){
            moves[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < K; i++){
            for(int j = 0; j < N; j++){
                int num = board[j][moves[i] - 1];
                if(num != 0){
                    if(stack.isEmpty() || stack.peek() != num){
                        stack.push(num);
                    }else if(stack.peek() == num) {
                        stack.pop();
                        answer += 2;
                    }

                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

        }


        System.out.println(answer);
        return ;
    }

}
