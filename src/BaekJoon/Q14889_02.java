package BaekJoon;

import java.util.Scanner;

public class Q14889_02 {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();
            }
        }

        divideTeams(0, 0);
        System.out.println(minDiff);
    }

    static void divideTeams(int idx, int count) {
        if (count == N / 2) {
            calculateDiff();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                divideTeams(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    static void calculateDiff() {
        int teamStart = 0, teamLink = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] && visited[j]) {
                    teamStart += S[i][j];
                } else if (!visited[i] && !visited[j]) {
                    teamLink += S[i][j];
                }
            }
        }

        int diff = Math.abs(teamStart - teamLink);
        minDiff = Math.min(minDiff, diff);
    }

    static int minus(){
        return 0;
    }
}
