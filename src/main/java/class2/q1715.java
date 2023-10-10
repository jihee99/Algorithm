package class2;

import java.io.*;
import java.util.PriorityQueue;

public class q1715 {
    //int result = 0;
    //for(N만큼 반복){
    //	두 개씩 뽑아 필요한 비교 수 구하기
    //	result에 비교 수 저장
    //	구한 합을 다시 pq에 넣기
    //}
    //
    //result 출력

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            pq.add(Integer.valueOf(br.readLine()));
        }
    }

}
