package Inflearn;

import java.util.Scanner;

public class Q1_07 {

    private String solution1(String str){
        //문자열을 소문자로 바꾼다.
        //lt, rt로 하나씩 가까워지며 같은지 확인하고, 같지 않은 것이 발견되면, 멈추고 No를 출력한다.
        char[] charArr = str.toLowerCase().toCharArray();
        int lt = 0, rt = charArr.length - 1;
        boolean flag = false;
        while(lt < rt){
            char first = charArr[lt];
            char second = charArr[rt];
            if(first == second){
                lt++;
                rt--;
            } else if (first != second) {
                flag = true;
                break;
            }
        }

        return flag == true ? "NO" : "YES";
    }
    private String solution2(String str){
        str = str.toUpperCase();

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) return "NO";
        }

        return "YES";
    }
    private String solution3(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();

        if(reversedStr.equalsIgnoreCase(str)) return "YES";

        return "NO";
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.next();
        Q1_07 object= new Q1_07();
        System.out.println(object.solution1(str));
        System.out.println(object.solution2(str));
        System.out.println(object.solution3(str));





        return ;
    }
}
