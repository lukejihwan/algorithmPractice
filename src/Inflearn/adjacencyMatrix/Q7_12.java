package Inflearn.adjacencyMatrix;

import java.util.Scanner;

public class Q7_12 {
    static int n,m,answer;
    static int[][] graph; // 연결된 노드 표시용
    static int[] ch; // 접근한 노드 체크용
    public static void main(String[] args) {
        Q7_12 main = new Q7_12();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        // 인접행렬의 크기를 지정
        graph = new int[n + 1][n + 1];

        // 그래프에 맞게 인접행렬에 표시
        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x][y] = 1;
        }

        ch[1] = 1;
        main.DFS(1);
    }

    public int DFS(int v){
        if(v == n){
            answer++;
        }else{

        }

    }

}
