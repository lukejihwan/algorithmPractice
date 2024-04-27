package Inflearn.문자열;

import java.util.Scanner;

public class Q1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char N = in.next().charAt(0);

        int[] indexArr = new int[str.length()];

        /* 해당 문제에서 기억해야 할 부분
        * 1. 여기서 관건은 count 를 1000으로 두는 것이다.
        * 두번째 for문에서 작은 값끼리 비교하면 양쪽 사이드의 값이 잘못나온다.
        * 그래서 양쪽 사이드 시작을 크게 잡고 시작함으로써 그 문제를 해결 할 수 있다.
        * 이렇게 코드를 작성하지 않고 간단히 해결 할 수 있는 방법도 있으니 다른 문제
        * 에서도 코드 작성없이 해결 할 수 있는 방법은 없을까 생각해보자.
        *
        * 2. 그리고 값 비교를 할 때 유용한 Math.min()을 사용하자.
        * 이 코드를 알고 있는 것만으로도, 코드가 줄어들 수 있다. Math.min()
        * 을 사용해 두 값을 간단히 비교하자.
        *
        * */
        int count = 1000;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == N){
                indexArr[i] = 0;
                count = 0;
            }else{
                count++;
                indexArr[i] = count;
            }
        }

        count = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == N){
                count = 0;
            }else{
                count++;
                indexArr[i] = Math.min(indexArr[i], count);
            }
        }

        for(int a : indexArr){
            System.out.print(a + " ");
        }

    }
}
