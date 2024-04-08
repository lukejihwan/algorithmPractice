package Inflearn;
import java.util.Scanner;

public class Q1_05 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String str = in.next();

        char[] charArr = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            char N = charArr[i];
            if((N >= 65 && N <= 90) || (N >= 97 && N <= 122)){
                char temp = charArr[i];
                charArr[i] = charArr[str.length() - i - 1];
                charArr[str.length() - i - 1] = temp;
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
