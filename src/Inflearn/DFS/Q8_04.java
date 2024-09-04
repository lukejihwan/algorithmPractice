package Inflearn.DFS;

import java.util.Scanner;

public class Q8_04 {
    static int n,m;
    static int[] arr;

    private void DFS(int L){
        if(L == m){
            for(int answer : arr){
                System.out.print(answer + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i <= n; i++){
                arr[L] = i;
                DFS(L + 1);
            }

        }

    }
    public static void main(String[] args) {
        Q8_04 main = new Q8_04();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[m];

        main.DFS(0);

    }
}
