package Inflearn.문자열;

import java.util.Scanner;
import java.io.*;

public class Q1_01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char one = in.next().charAt(0);

        str = str.toUpperCase();
        one = Character.toUpperCase(one);
        int count = 0;
        for(char result : str.toCharArray()){
            if(one == result) count++;
        }

        System.out.println(count);
    }

    private int resolve1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toUpperCase().toCharArray();
        String oneChar = br.readLine();
        int count = 0;

        for(int i = 0; i < charArr.length; i++){
            if(String.valueOf(charArr[i]).equals(oneChar.toUpperCase())) count++;
        }
        return count;
    }

    private int resolve2(){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char one = in.next().charAt(0);

        str = str.toUpperCase();
        one = Character.toUpperCase(one);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(one == str.charAt(i)) count ++;
        }
        return count;
    }

}
