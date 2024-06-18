package Inflearn.BFS;

import java.util.Scanner;

public class Q7_01 {
    private static int plus(int K, int N){

        int share = (K - N) / 5;
        int rest = (K - N) % 5;

        // 5로 나눈 몫과 나머지를 구한다.
        // 나머지가 5에 가까우면 K를 넘고 뒤로 이동하고,
        // 나머지가 0에 가까우면 K전에서  앞으로 이동한다.

        if(rest == 0){
            return share;
        }else if(rest <= 2){
            return share + rest;
        }else if(rest >= 3){
            return share + 1 + (5 - rest);
        }

        return 0;
    }

    private static int minus(int K, int N){
        return N - K;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        if(K > N){
            System.out.println(plus(K, N));
        }else{
            System.out.println(minus(K, N));
        }

    }
}
