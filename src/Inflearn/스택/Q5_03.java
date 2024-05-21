package Inflearn.스택;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] board = new int[N + 1][N + 1];
        for(int i = 1; i < N; i++){
            for(int j = 1; j < N; j++){
                board[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        int[] moves = new int[K];
        for(int i = 0; i < K; i++){
            moves[i] = in.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < K; i++){
            int index = 1;
            while(board[moves[i]][index++] == 0){

                int doll = board[moves[i]][index];
                if(doll != 0){
                    list.add(doll);
                    board[moves[i]][index] = 0;
                }

            }
        }

        int answer = 0;

        int lt = 0;
        for(int rt = 1; rt < list.size(); rt++){
            if(list.get(rt) == list.get(lt)){
                answer += 2;
                rt++;
                lt--;
                while(list.get(rt) == list.get(lt)){
                    answer += 2;
                    rt++;
                    lt--;
                }
                lt = rt - 2;
            }
            lt++;
        }

        System.out.println(answer);
        return ;
    }
}
