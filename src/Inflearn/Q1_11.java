package Inflearn;

import java.util.Scanner;

public class Q1_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        //문자열을 하나씩 접근하면서 같은 것들까지 자르고, string다시생성하고
        //하는 식으로 하면서, 문자열에 값이 없을 때까지 반복하자.

        //1개만 있을 때는 뒤에 숫자가 붙지 않고,
        //2개 이상일 때 뒤에 숫자가 붙는다.
        String answer = "";
        for(int i = 0; i <str.length(); i++){
            int count = 0;
            char N = str.charAt(i);
            while(i < str.length() && N == str.charAt(i)){
                count++;
                i++;
            }
            i--;

            if(count == 1){
                answer += N;
            }else{
                answer = answer + N + count;
            }

        }
        System.out.print(answer);
    }
}
