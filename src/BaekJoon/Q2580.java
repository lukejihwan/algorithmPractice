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

        int count = 0;
        do{
            count = 0;
            for(int i = 1; i <= 9; i++){
                for(int j = 1; j <= 9; j++){
                    int num = map[i][j];
                    if(num == 0){
                        count++;
                        DFS(i, j);
                    }
                }
            }
        } while (count > 0);

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void DFS(int y, int x){
        // 세로에서 구할 수 있는지 체크한다.
        boolean[] visited = new boolean[10];
        int count1 = 0;
        for(int i = 1; i <= 9; i++){
            if(map[i][x] != 0){
                visited[map[i][x]] = true;
            }else{
                count1++;
            }
        }
        if(count1 == 1){
            for(int i = 1; i <= 9; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
            return;
        }

        visited = new boolean[10];
        int count2 = 0;
        for(int i = 1; i <= 9; i++){
            if(map[y][i] != 0){
                visited[map[y][i]] = true;
            }else{
                count2++;
            }
        }
        if(count2 == 1){
            for(int i = 1; i <= 9; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
            return;
        }

        // 9칸에서 구할 수 있는지 체크한다.
        visited = new boolean[10];
        int count3 = 0;
        int startY = returnRange(y);
        int startX = returnRange(x);
        for(int i = startY; i < startY + 3; i++){
            for(int j = startX; j < startX + 3; j++){
                if(map[i][j] != 0){
                    visited[map[i][j]] = true;
                }else{
                    count3++;
                }
            }
        }
        if(count3 == 1){
            for(int i = 1; i <= 9; i++){
                if(!visited[i]){
                    map[y][x] = i;
                }
            }
        }

    }

    public static int returnRange(int num){
        if(num >= 1 && num <= 3){
            return 1;
        } else if (num >= 4 && num <= 6) {
            return 4;
        } else {
            return 7;
        }
    }
}
