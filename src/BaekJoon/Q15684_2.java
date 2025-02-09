package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15684_2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int h = in.nextInt();
        int[][] map = new int[x][y];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < h; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[x][y + 1] = 2;
        }

    }
}
