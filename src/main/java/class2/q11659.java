package class2;

//숫자 개수를 저장할 정수형 변수 N 선언
//질의 개수를 저장할 정수형 변수 M 선언
//
//for(N만큼 반복){
//	합배열 생성 S[i] = S[i-1] + A[i]
//}
//
//for(M만큼 반복){
//	질의 범위를 저장할 정수형 변수 i, j 선언
//	구간 합 출력 S[j] - S[i-1]
//}

import java.io.*;
import java.util.StringTokenizer;

public class q11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int k=0; k<M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(S[j] - S[i - 1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
