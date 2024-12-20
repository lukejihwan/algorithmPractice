package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1759 {
    static ArrayList<String> list = new ArrayList<>();
    static int l, c;
    static String[] brute, answer;
    static String[] vowels = {"a", "e", "i", "o", "u"};

    public static void solution(){
        // 모음 1개에 자음 2개이상이어야 함
        // level 4 까지임
        // 4개가 완성되고 나서 모음 1, 자음 2를 체크해야함

        // i까지 반복한다.
        int i = 0;
        while(i != l){
            DFS(brute[i], 1);
            i++;
        }

    }

    public static void DFS(String element, int level){
        if(level == l){
            int vowelEa = 0;
            for(int i = 0; i < l; i++){
                for(int j = 0; j < vowels.length; j++){
                    if(answer[i] == vowels[j]) vowelEa++;
                }
            }
            if(vowelEa >= 1 && (l - vowelEa) >= 2){
                String g = "";
                for(int i = 0; i < l; i++){
                    g += answer[i];
                }
                list.add(g);
            }
            return;
        }else{
            DFS(element, level++);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        c = in.nextInt();
        brute = new String[c];
        answer = new String[l];
        for(int i = 0; i < c; i++){
            brute[i] = in.next();
        }

        Arrays.sort(brute);

        //백트래킹을 활용한 브루트 포스 문제
        solution();

        for(String ans : list){
            System.out.println(ans);
        }

    }
}
