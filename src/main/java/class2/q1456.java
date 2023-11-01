package class2;

import java.io.*;
import java.util.*;

public class q1456 {

    public  static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long start = Integer.parseInt(st.nextToken());
        long end = Integer.parseInt(st.nextToken());

        long[] arr = new long[10000001];

        // 2 ~ 10 000 000
        // 소수 배열 초기화
        for(int i=2; i<=10000000; i++){
            arr[i] = i;
        }

        // 소수 구하기
        for(int i=2; i<=Math.sqrt(arr.length); i++){
            if(arr[i] == 0) continue;
            for(int j = i+i; j<arr.length; j=j+1){
                arr[j] = 0;
            }
        }

        // start, end 사이에 값이 있는지 확인하는 과정
        // 소수를 제곱한 값이 start 와 end 사이에 있어야 함.
        int count = 0;
        for(int i=2; i<10000001; i++){
            if(arr[i] != 0){
                long temp = arr[i];
                long now = temp;
                while(now < end){

                    if(temp >= start) count++;
                    now *= temp;
                }

            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
