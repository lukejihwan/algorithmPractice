package Inflearn.문자열;

import java.io.IOException;
import java.util.Scanner;

public class Q1_03 {

    // 내가 푼 방식
    public String solution1(String str){

        String[] strArr = str.split(" ");

        int bigIndex = 0;
        for(int i = 0; i < strArr.length; i++){
            bigIndex = strArr[i].length() > strArr[bigIndex].length() ? i : bigIndex;
        }
        return strArr[bigIndex];
    }

    //강의자님 풀이 1
    public String solution2(String str){
        String answer = "";
        int size = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        String[] strArr = str.split(" ");
        for(String N : strArr){
            int len = N.length();
            if(size < len){
                size = len;
                answer = N;
            }

        }

        return answer;
    }

    //강의자님 풀이 2
    public String solution3(String str){
        String answer = "";
        int len = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1){
            String tmp = str.substring(0, pos);
            int N = tmp.length();
            if(len < N){
                len = N;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > len) answer = str;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        Q1_03 solution = new Q1_03();

        String answer1 = solution.solution1(line);
        System.out.println(answer1);

        String answer2 = solution.solution2(line);
        System.out.println(answer2);

        String answer3 = solution.solution2(line);
        System.out.println(answer3);
    }
}
