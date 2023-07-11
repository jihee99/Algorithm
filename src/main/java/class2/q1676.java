package class2;

//방법 1
//직관적으로 팩토리얼을 구한 후 뒤에서부터 0의 개수를 구하는 방법

//방법 2
//n!은 곱의 계산이기 때문에 0의 개수는 결국 10이 몇번 곱해졌는지 세는 것이다
//10은 2와 5의 곱으로 이루어졌기 때문에
//1부터 n 까지 for 문을 돌며 while로 소인수분해를 해 그 안에 2*5 쌍의 개수를 찾으면 된다.


import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class q1676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

//        BigInteger big = new BigInteger("1");
//        for(int i=1; i<=N; i++){
//            big = big.multiply(BigInteger.valueOf(i));
//        }
//
//        int cnt = 0;
//        String str = String.valueOf(big);
//        System.out.println("@@");
//        System.out.println(str);
//
//        for(int i=str.length()-1; i>0; i--){
//           if(str.charAt(i) == '0') cnt++;
//           else break;
//        }
//        bw.write(String.valueOf(cnt));
//        bw.flush();
//        bw.close();
        int cnt = 0;
        for(int i=1; i<= N; i++){
            int num = i;
            while(num%5==0){
                cnt++;
                num /= 5;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
