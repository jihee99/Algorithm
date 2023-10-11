package class2;

import java.io.*;
import java.util.PriorityQueue;

public class q1715 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            pq.add(Integer.valueOf(br.readLine()));
        }

        int num1, num2;
        int sum=0;
        while(pq.size() != 1){
            num1 = pq.remove();
            num2 = pq.remove();
            sum += num1 + num2;
            pq.add(num1+num2);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

}
