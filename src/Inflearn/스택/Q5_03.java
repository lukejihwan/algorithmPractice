package Inflearn.스택;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q5_03 {

    private static int solution1(int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
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

        return answer;
    }

    private static int solution2(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves){
            for(int i = 0; i < board.length; i++){
                int temp = board[i][move - 1];

                if(temp != 0){
                    board[i][move - 1] = 0;
                    if(!stack.isEmpty() && stack.peek() == temp){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] board1 = new int[N][N];
        int[][] board2 = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board2[i][j] = board1[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        int[] moves = new int[K];
        for(int i = 0; i < K; i++){
            moves[i] = in.nextInt();
        }

        System.out.println(solution1(board1, moves));
        System.out.println(solution2(board2, moves));
    }

}
