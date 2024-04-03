package Inflearn;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Q1_01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toUpperCase().toCharArray();
        String oneChar = br.readLine();
        int count = 0;

        for(int i = 0; i < charArr.length; i++){
            if(String.valueOf(charArr[i]).equals(oneChar.toUpperCase())) count++;
        }

        System.out.println(count);
    }
}
