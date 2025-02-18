package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15684_2 {
    static int min, h, n;
    static int[][] map;
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

    public static void dfs(int level, int num, int col) {
        if(level>num || level > min) {
            return ;
        }
        if(isPossible()) {
            min = Math.min(min,level);
            System.out.println(min);
            System.exit(0);
            return ;
        }
        for(int i=col; i<=h; i++) {
            for(int j=1; j<=n; j++) {
                if(map[i][j]==0 && map[i][j-1]==0 && map[i][j+1]==0) {
                    map[i][j]=1;
                    dfs(level+1,num,i);
                    map[i][j]=0;
                }
            }
        }
    }

    public static boolean isPossible()
    {
        if(n == min){
            return false;
        }
        return true;
    }

}
