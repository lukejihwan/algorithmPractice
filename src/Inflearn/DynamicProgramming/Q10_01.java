package Inflearn.DynamicProgramming;

import java.util.Scanner;

public class Q10_01 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++){
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[n];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q10_01 main = new Q10_01();
        int n = in.nextInt();
        dy = new int[n + 1];
        System.out.println(main.solution(n));

    }
}
