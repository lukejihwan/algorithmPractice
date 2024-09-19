package Inflearn.DFS;

import java.util.Scanner;

public class Q8_10 {
    static int[][] map;
    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0, -1}};
    static int answer;

    private void DFS(int x, int y){
        if(x == 7 && y == 7){
            answer++;
        }else{
            for(int i = 0; i < dir.length; i++){
                int nextL = x + dir[i][0];
                int nextR = y + dir[i][1];
                if(nextL <= 7 && nextR <= 7 && nextL >= 1 && nextR >= 1 && map[nextL][nextR] == 0){
                    map[x][y] = 1;
                    DFS(x + dir[i][0], y + dir[i][1]);
                    map[x][y] = 0;
                }
            }

        }

    }
    public static void main(String[] args) {
        Q8_10 main = new Q8_10();
        Scanner in = new Scanner(System.in);
        map = new int[8][8];
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                map[i][j] = in.nextInt();
            }
        }
        main.DFS(1, 1);
        System.out.println(answer);
    }
}
