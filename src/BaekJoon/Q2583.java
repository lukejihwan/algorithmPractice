package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2583 {

    static int[][] map;
    static int m, n, k, size;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static ArrayList<Integer> result;
    public static void draw(twoPoint[] arr){

        for(int i = 0; i < k; i++){
            twoPoint point = arr[i];
            for(int j = point.y1; j < point.y2; j++){
                for(int z = point.x1; z < point.x2; z++){
                    map[j][z] = 1;
                }
            }
        }

    }

    public static void solution(){

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 0){
                    size = 1;
                    DFS(i, j);
                    result.add(size);
                }
            }
        }
    }

    public static void DFS(int y, int x){
        map[y][x] = 1;
        // 4군데 모두 1인경우 끝!
        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && map[nextY][nextX] == 0){
                size++;
                DFS(nextY, nextX);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        k = in.nextInt();
        twoPoint[] twoPoints = new twoPoint[k];
        result = new ArrayList<>();

        map = new int[m][n];

        for(int i = 0; i < k; i++){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            twoPoints[i] = new twoPoint(x1, y1, x2, y2);
        }

        draw(twoPoints);

        solution();
        Collections.sort(result);

        System.out.println(result.size());
        for(int a : result){
            System.out.print(a + " ");
        }

    }

}

class twoPoint{
    int x1, y1, x2, y2;
    twoPoint(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
