package Inflearn.문자열;
import java.util.Scanner;

public class Q1_05 {

    private String solution1(String str){
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt){
            char first = charArr[lt];
            char second = charArr[rt];

            if((first >= 65 && first <= 90) || (first >= 97 && first <= 122)){
                if((second >= 65 && second <= 90) || (second >= 97 && second <= 122)){
                    charArr[rt] = first;
                    charArr[lt] = second;
                    lt++;
                    rt--;
                }else{
                    rt--;
                }
            }else{
                lt++;
            }
        }

        String answer = "";
        for(char M : charArr){
            answer += M;
        }


        return answer;
    }

    private String solution2(String str){
        char[] charArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt){
            if(!Character.isAlphabetic(charArr[lt])) lt++;
            else if (!Character.isAlphabetic(charArr[rt])) rt--;
            else {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

        Q1_05 q105 = new Q1_05();

        String answer1 = q105.solution1(str);
        System.out.println(answer1);

        String answer2 = q105.solution2(str);
        System.out.println(answer2);

        return ;
    }
}
