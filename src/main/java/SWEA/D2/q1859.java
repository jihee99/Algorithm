package SWEA.D2;

import java.io.*;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1859 {

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int duration = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int[] price = new int[duration];
            for(int i=0; i<duration; i++){
                price[i] = Integer.parseInt(st.nextToken());
            }

            //뒤에서부터 큰값이 나오면 리셋하기.맨뒤에 값이 무조건 큰값이라고 가정하기
            long max = Long.MIN_VALUE;
            int num = 0;
            long cost = 0L;     // 구매가
            long result = 0L;   // 최종
            for(int i=duration-1; i>=0; i--){
                if(price[i] > max){
                    result += (max*num - cost);
                    max = price[i];
                    cost = 0;
                    num = 0;
                }else{
                    cost += price[i];
                    num++;
                }
            }
            result += (max*num - cost);
            sb.append("#").append(test_case).append(" ").append(result).append("\n");

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
