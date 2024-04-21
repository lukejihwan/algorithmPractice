package Inflearn;

import java.util.Scanner;

public class Q1_12 {

    private String solution1(int N, String str){
        // 첫번째 줄의 갯수만큼 담을 String필요
        // 첫번째 변수 길이 * 7만큼 반복
        // 7의 문자를 # 이면 1로 * 이면 0으로 이진문자열에 저장후
        // 뒤에서 부터 2씩 곱해가며 계산한 십진수를 char형으로 변환
        // 변수에 담고 출력
        String answer = "";
        int max = 0, sum = 0;
        for(int i = 0; i < N * 7; i++){

            if((i % 7) == 0){
                max = 128;
                sum = 0;
            }

            char M = str.charAt(i);
            max = max / 2;

            if(M == '#') sum += max;
            if(((i + 1) % 7) == 0) answer += (char)sum;
        }

        return answer;
    }

    private static String solution2(int N, String str){
        String answer = "";
        for(int i = 0; i < N; i++){
            String result = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(result, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String str = in.next();

        Q1_12 object = new Q1_12();
        System.out.println(object.solution1(N, str));
        System.out.println(solution2(N, str));
    }
}
