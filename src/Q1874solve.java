import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q1874solve {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //수열의 개수
        int[] array=new int[N];
        int[] Naturalarray=new int[N];
        ArrayList<Integer> list=new ArrayList();
        int a=1;

        for(int i=0; i<N; i++){
            array[i]=sc.nextInt();
            Naturalarray[i]=i+1;
        }

        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0; i<N; i++){
            if(a<=array[i]){
                while(a==array[i]){
                    System.out.println("+");
                    stack.push(a);
                    a++;
                }
                stack.pop();
                a--;
                System.out.println("-");

            }else{ //자연수가 배열 수 보다 크다면
                stack.pop();
                //if(){

                //}
            }
        }

    }
}
