package Inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for(char key : str2.toCharArray()){
            hashMap2.put(key, hashMap2.getOrDefault(key, 0) + 1);
        }

        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        for(int i = 0; i < str2.length() - 1; i++){
            hashMap1.put(str1.charAt(i), hashMap1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int rt = str2.length() - 1, lt = 0, answer = 0;
        while(rt < str1.length()){
            hashMap1.put(str1.charAt(rt), hashMap1.getOrDefault(str1.charAt(rt), 0) + 1);
            if(hashMap1.equals(hashMap2)) answer++;
            if(hashMap1.get(str1.charAt(lt)) == 1){
                hashMap1.remove(str1.charAt(lt));
            }else{
                hashMap1.put(str1.charAt(lt), hashMap1.get(str1.charAt(lt)) - 1);
            }
            lt++;
            rt++;
        }

        System.out.println(answer);
    }
}
