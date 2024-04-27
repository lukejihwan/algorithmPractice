package Inflearn.문자열;

import java.util.Scanner;

public class Q1_08 {

    private String solution1(String str){
        String answer = "NO";
        char[] charArr = str.toUpperCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        /*
         * 배운 내용 : next() 메서드는 delimeter를 이전 문자열만 가져오게 된다.
         * 즉, "asd ads da" 문자열에서 asd까지만 next() 문자열로 하나의 토큰으로 인식
         * 한다는 것이다.
         * 반면에 nextLine() 메서드는 \n 이나 \r같은 delimeter까지 가져오게된다.
         * 그래서 "asdf asd df" 문자열에 공백이나 개행문자까지 하나의 문자열로 가져오는 것이다.
         * */

        while(lt < rt){
            if(!Character.isAlphabetic(charArr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(charArr[rt])){
                rt--;
            }else{
                if(charArr[lt] != charArr[rt]){
                    return answer;
                }
                lt++;
                rt--;
            }
        }
        answer = "YES";

        return answer;
    }

    private String solution2(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversedStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr)) return answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Q1_08 object = new Q1_08();
        System.out.println(object.solution1(str));
        System.out.println(object.solution2(str));
    }
}
