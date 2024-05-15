package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_01 {
    private static char[] charArr = {'A', 'B', 'C', 'D', 'E'};

    private static char solution1(int N, String str){
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

        return selected;
    }

    private static char solution2(int N, String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        int max = 0;
        Character result = ' ';
        for(char one : map.keySet()){
            int num = map.get(one);
            if(max < num){
                max = num;
                result = one;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String str = in.next();

        System.out.println(solution1(N, str));
        System.out.println(solution2(N, str));

    }
}
