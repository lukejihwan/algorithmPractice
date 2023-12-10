package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char[] charArray = str.toUpperCase().toCharArray();

        Arrays.sort(charArray);

        Map<Character, Integer> alpaMap = new HashMap<>();

        int count = 0;
        for (char c : charArray) {
            if (alpaMap.containsKey(c)) {
                alpaMap.put(c, ++count);
            } else {
                count = 0;
                alpaMap.put(c, ++count);
            }
        }

        int maxValue = 0;
        char maxCharacter = 0;

        for(Map.Entry<Character, Integer> entrySet : alpaMap.entrySet()){
            if(entrySet.getValue() > maxValue){
                maxValue = entrySet.getValue();
                maxCharacter = entrySet.getKey();
            }else if(entrySet.getValue() == maxValue){
                maxCharacter = '?';
            }
        }

        bw.write(maxCharacter + "\n");
        br.close();
        bw.close();

    }
}
