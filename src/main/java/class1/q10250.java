package class1;

import java.io.*;
import java.util.*;

public class q10250 {
    public static void main(String[] args) throws IOException{
        // h -> 층수
        // w -> 방수
        // n -> 몇번째 손님인지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());  //층 수
            st.nextToken();  //각 층의 방 수
            int n = Integer.parseInt(st.nextToken());

            if (n % h == 0) {
                // h 층을 배정받아야함
                sb.append((h * 100) + (n / h)).append('\n');
            } else {
                sb.append(((n % h) * 100) + ((n / h) + 1)).append('\n');
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }

}
