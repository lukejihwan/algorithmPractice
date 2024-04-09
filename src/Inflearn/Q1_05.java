package Inflearn;
import java.util.Scanner;

public class Q1_05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

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

        System.out.println(answer);
        return ;
    }
}
