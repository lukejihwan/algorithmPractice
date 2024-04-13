package Inflearn;

import java.util.Scanner;

public class Q1_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toUpperCase();
        char[] charArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt){
            if(!Character.isAlphabetic(charArr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(charArr[rt])){
                rt--;
            }else{
                if(charArr[lt] != charArr[rt]){
                    System.out.println("NO");
                    return;
                }
                lt++;
                rt--;
            }
        }

        System.out.println("YES");
        return ;
    }
}
