package Inflearn.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8_14 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Nodedd> house, pizzas;

    private void DFS(int L, int s){
        if(L == m){
            int sum = 0;
            for(Nodedd h : house){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis, Math.abs(h.x - pizzas.get(i).x) + Math.abs(h.y - pizzas.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = s; i < len; i++){
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }
    public static void main(String[] args) {
        Q8_14 main = new Q8_14();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] board = new int[n + 1][n + 1];
        house = new ArrayList();
        pizzas = new ArrayList();
        combi = new int[m];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int num = in.nextInt();
                board[i][j] = num;
                if(num == 1){
                    house.add(new Nodedd(i, j));
                } else if (num == 2) {
                    pizzas.add(new Nodedd(i, j));
                }
            }
        }
        len = pizzas.size();

        main.DFS(0, 0);
        System.out.println(answer);
    }


}

class Nodedd{
    int x, y;
    public Nodedd(int x, int y){
        this.x = x;
        this.y = y;
    }
}
