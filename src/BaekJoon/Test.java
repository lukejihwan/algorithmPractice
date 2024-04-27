package BaekJoon;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Test {



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] array=new int[N];
        int num=1;
        boolean result=true;

        for(int i=0; i<N; i++){
            array[i]=sc.nextInt();
        }
        StringBuffer sb=new StringBuffer();
        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<array.length; i++){
            if(num<=array[i]){
                while(num<=array[i]){
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");

            }else{
                int b=stack.pop();
                if(b>array[i]){
                    result=false;
                    System.out.println("No");
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(result)System.out.println(sb.toString());

    }
}
