package Inflearn.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_06 {

    //내 풀이 방법
    private String solution1(String str){
        char[] charArr = str.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            boolean flag = false;
            char N = charArr[i];
            for(int j = 0; j < list.size(); j++){
                if(N == list.get(j)){
                    flag = true;
                }
            }
            if(flag == false){
                list.add(N);
            }
        }
        String answer = "";
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }

        return answer;
    }

    private String solution2(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Q1_06 object = new Q1_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(object.solution1(str));
        System.out.println(object.solution2(str));
    }
}
