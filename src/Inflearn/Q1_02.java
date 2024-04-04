package Inflearn;

import java.util.Scanner;
public class Q1_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                sb.append((char)(str.charAt(i) - 32));
            }else{
                sb.append((char)(str.charAt(i) + 32));
            }
        }

        System.out.println(sb.toString());
    }
}
