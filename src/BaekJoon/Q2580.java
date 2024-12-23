package BaekJoon;

import java.util.Scanner;

public class Q2580 {
    static int[][] map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // map 은 9 x 9 임
        // 0을 만나면, 해당 값을 구할수 있는지 체크한다.
        // 구할수 있는 경우는 특정값 한개가 나올 수 있는 경우이다.
        // 구했다면 그값이 생김으로 인해 영향받는 곳의 값을 구한다. x
        // 없으면 다음 0으로 넘어간다. x
        // 아래 세가지를 체크한다.
        // 1. 가로 한줄
        // 2. 세로 한줄
        // 3. 3 x 3
        // 0이 없을 때까지 반복한다
        map = new int[10][10];
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                map[i][j] = in.nextInt();
            }
        }

        solution();



    }

    public static void solution(){

        for(int i = 1; i <= map.length; i++){
            for(int j = 1; j <= map.length; j++){
                int num = map[i][j];
                if(num == 0){
                    DFS(i, j);
                }
            }
        }

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void DFS(int y, int x){
        System.out.println(y + " " + x);
        // 세로에서 구할 수 있는지 체크한다.
        boolean[] visited = new boolean[10];
        int count1 = 0;
        for(int i = 1; i <= map.length; i++){
            if(map[i][x] != 0){
                visited[map[i][x]] = true;
            }else{
                count1++;
            }
        }
        if(count1 == 1){
            for(int i = 1; i <= map.length; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
        }

        // 가로에서 구할 수 있는지 체크한다.
        visited = new boolean[10];
        int count2 = 0;
        for(int i = 1; i <= map.length; i++){
            if(map[y][i] != 0){
                visited[map[y][i]] = true;
            }else{
                count2++;
            }
        }
        if(count2 == 1){
            for(int i = 1; i <= map.length; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
        }

        // 9칸에서 구할 수 있는지 체크한다.
        visited = new boolean[10];
        int count3 = 0;
        for(int i = y / 3; i < 3; i++){
            for(int j = x / 3; j < 3; j++){
                if(map[i][j] != 0){
                    visited[map[i][j]] = true;
                }else{
                    count3++;
                }
            }
        }
        if(count3 == 1){
            for(int i = 1; i <= map.length; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
        }

    }
}
