package class1;

import java.util.*;

public class q10871 {

    public static void main(String[] args){
        //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int st = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            if(num<st){
                System.out.print(num + " ");
            }
        }
    }
}
