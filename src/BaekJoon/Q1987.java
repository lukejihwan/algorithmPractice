package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1987 {
    static int r, c, answer;
    static char[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Character> list = new ArrayList<>(); // 지나간 곳의 알파벳 담는곳
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c = in.nextInt();
        map = new char[r][c];
        visited = new boolean[r][c];
        for(int i = 0; i < r; i++){
            String line = in.next();
            for(int j = 0; j < c; j++){
                map[i][j] = line.charAt(j);
            }
        }

        answer = Integer.MIN_VALUE;

        DFS(0, 0, 1);
        // map을 만든다.
        // 방향 dx, dy를 만든다.
        // 가볼수있는 루트는 모두 가본다. (DFS)
        // 궁금 : DFS와 BFS를 어떤 상황에 적용해야하는지 차이점은?
        // 갈수 있는 길의 조건은 아래와 같다.
        // 1. map을 벗어나면 안된다.
        // 2. visited된 길을 다시 갈수 없다.
        // 3. 같은 알파벳을 또 지날 수 없다.(지나간 알파벳을 담아두어야 함)
        System.out.println(answer);

    }

    public static void DFS(int y, int x, int level){


        // 아무곳도 갈수없으면 끝난다.
        if(canNotGo(y, x)){
            answer = Math.max(answer, level);
        }else{
            for(int i = 0; i < dx.length; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (nextX >= 0 && nextX < c && nextY >= 0 && nextY < r){
                    // 방문한적이 없는 node여야한다.
                    if(!visited[nextY][nextX]){
                        int count = 0;
                        for(char alpha : list){
                            if(alpha == map[nextY][nextX]) count++;
                        }
                        if(count == 0){
                            char currentLocation = map[y][x];
                            list.add(currentLocation);
                            DFS(nextY, nextX, level + 1);
                        }

                    }

                }

            }

        }

    }

    public static boolean canNotGo(int y, int x){
        // 사방이 모두 못가는 곳이어야 함.
        // 1. 벽으로 막히거나
        // 2. 방문한적이 있거나
        // 3. 같은 알파벳이 있거나
        list.add(map[y][x]);
        for(int i = 0; i < dx.length; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >= 0 && nextX < c && nextY >= 0 && nextY < r){
                if(!visited[nextY][nextX]){
                    for(char alpha : list){
                        if(alpha == map[nextY][nextX]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
