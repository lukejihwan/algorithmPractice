package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_02 {

    private static String solution1(String str1, String str2){
        // 두개의 HashMap구조를 선언하고, 각각의 문자열의 문자와 갯수를 저장하고, 비교하여
        // 같으면 YES, 아니면 NO를 출력한다.

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < str1.length(); i++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        boolean flag = true;
        for(Character key : map1.keySet()){
            if(map1.get(key) != map2.getOrDefault(key, 0)) flag = false;
        }

        return flag ? "YES" : "NO";
    }

    private static String solution2(String str1, String str2){
        // map에 첫번째 문자열(str1)의 값으로 HashMap을 만들어둔뒤,
        // 두번째 문자열(str2) 의 문자만큼 차감하면서 두 문자열의 구성이 같은지 다른지 체크하는 방식

        HashMap<Character, Integer> map = new HashMap<>();
        for(char key : str1.toCharArray()){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(char key : str2.toCharArray()){
            if(!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key) - 1);
        }

        return "YES";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution1(str1, str2));
        System.out.println(solution2(str1, str2));
    }
}
