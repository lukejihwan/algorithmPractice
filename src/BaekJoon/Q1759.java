package BaekJoon;

import java.util.Scanner;

public class Q1759 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int c = in.nextInt();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[] brute = new String[c];
        for(int i = 0; i < c; i++){
            brute[i] = in.next();
        }

        //백트래킹을 활용한 브루트 포스 문제

    }
}
