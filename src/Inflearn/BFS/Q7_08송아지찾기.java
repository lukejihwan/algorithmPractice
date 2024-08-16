package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7_08송아지찾기 {
    int[] array; // 방문한 것들 모음
    int[] direction = {1, -1, 5};
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int start, int goal){
        int level = 0;
        array = new int[10001]; // 범위가 1부터 10000까지라고 했기 때문에 범위를 넣음
        array[start] = 1; // 방문한 곳 체크
        Q.offer(start);
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int x = Q.poll();
                for(int j = 0; j < 3; j++){
                    int nx = x + direction[j];
                    if(nx == goal) return level + 1;
                    if(nx >= 1 && nx <= 10000 && array[nx] == 0){
                        array[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int goal = in.nextInt();
        Q7_08송아지찾기 T = new Q7_08송아지찾기();

        System.out.println(T.BFS(start, goal));

    }
}
