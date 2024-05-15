package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

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

        System.out.println(flag ? "YES" : "NO");
    }
}
