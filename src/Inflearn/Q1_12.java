package Inflearn;

import java.util.Scanner;

public class Q1_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 첫번째 줄의 갯수만큼 담을 String필요
        // 첫번째 변수 길이 * 7만큼 반복
        // 7의 문자를 # 이면 1로 * 이면 0으로 이진문자열에 저장후
        // 뒤에서 부터 2씩 곱해가며 계산한 십진수를 char형으로 변환
        // 변수에 담고 출력
        int N = in.nextInt();
        String str = in.next();
        String answer = "";
        for(int i = 1; i <= N; i++){
            int max = 128;
            int sum = 0;
            for(int a = 1; a <= 7; a++){
                char M = str.charAt(i * a - 1);
                max = max / 2;
                if(M == '#') sum += max;
            }
            answer += Character.forDigit(sum, 10);
        }

        System.out.println(answer);
        return ;
    }
}
