package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_01 {
    private static char[] charArr = {'A', 'B', 'C', 'D', 'E'};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //hashMap을 사용해서 문제를 풀어야 함.
        int N = in.nextInt();
        String str = in.next();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < charArr.length; i++){
            map.put(charArr[i], 0);
        }

        for(int i = 0; i < N; i++){
            int num = map.get(str.charAt(i));
            map.replace(str.charAt(i), ++num);
        }

        char selected = ' ';
        int max = 0;
        for(int i = 0; i < charArr.length; i++){
            int vote = map.get(charArr[i]);
            if(max < vote){
                selected = charArr[i];
                max = vote;
            }
        }

        System.out.println("안녀하세요");
        System.out.println(selected);
    }
}
