import java.util.Scanner;
import java.util.Stack;

public class Q1874 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        Stack<Integer> stack=new Stack<>();
        StringBuffer bf=new StringBuffer(); //String 이어 붙이기 위한 클래스
        int num=1; //오름차순 수를 위한 num?? 왜 있는지 살펴보자
        boolean result=true; //true일 때만 전체 수열 배정 과정을 출력할 수 있도록 아니면 No만 출력됨
        for(int i=0; i<A.length; i++){
            int su=A[i];
            if(su>=num){
                while(su>=num){
                    stack.push(num++);
                    bf.append("+\n"); //줄바꿈을 StringBuffer에 넣어줌
                }
                stack.pop();
                bf.append("-\n");
            }else{ //현재 수열값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
                int n=stack.pop();
                //스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수가 없음
                if(n>su){
                    System.out.println("No");
                    result =false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result)  System.out.println(bf.toString());
    }
}
