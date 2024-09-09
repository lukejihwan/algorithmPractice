package Inflearn.DFS;

import java.util.Scanner;

public class Q8_06 {
    static int N, M;

    private void DFS(int L, int[] nums, int[] checked, int[] pm){
        if(L == M){
            for(int i = 0; i < M; i++){
                System.out.print(checked[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = 0; i < N; i++){
                if(pm[i] == 0){
                    pm[i] = 1;
                    checked[L] = nums[i];
                    DFS(L + 1, nums, checked, pm);
                    pm[i] = 0;
                }
            }

        }

    }
    public static void main(String[] args) {
        Q8_06 main = new Q8_06();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        int[] nums = new int[N];
        int[] checked = new int[M];
        int[] pm = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = in.nextInt();
        }

        int L = 0;
        main.DFS(L, nums, checked, pm);
    }
}
