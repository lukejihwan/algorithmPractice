package Inflearn.DynamicProgramming;

import java.util.Scanner;

public class Q10_06_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] dy = new int[m + 1];
        for(int i = 0; i < n; i++){
            int ps = in.nextInt();
            int pt = in.nextInt();
            for(int j = m; j >= pt; j--){
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        System.out.println(dy[m]);

    }
}
