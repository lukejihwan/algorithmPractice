package Inflearn;

import java.util.Scanner;
public class Q1_02 {
    public static void main(String[] args) {
        /*
        * ASCII코드표에서 영문 소문자는 97 ~ 122
        * 대문자는 65 ~ 90이다.
        * */

        String str = new Q1_02().solution1();


        System.out.println(str);
    }

    //Character Wrapper클래스를 사용한 방식
    private String solution2(){
        String answer = "";
        Scanner sc = new Scanner(System.in);

        for(char N : sc.next().toCharArray()){
            if(Character.isLowerCase(N)) answer += Character.toUpperCase(N);
            else answer += Character.toLowerCase(N);
        }

        return answer;
    }

    private String solution1(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                sb.append((char)(str.charAt(i) - 32));
            }else{
                sb.append((char)(str.charAt(i) + 32));
            }
        }

        return sb.toString();
    }

}
