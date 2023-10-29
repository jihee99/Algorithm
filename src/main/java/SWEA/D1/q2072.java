package SWEA.D1;

import java.io.*;
import java.util.StringTokenizer;

public class q2072 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		int[] numArr = new int[10];

		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=loop; i++){
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++){
				int now = Integer.parseInt(st.nextToken());
				if(now%2 != 0){
					sum += now;
				}
			}
			sb.append("#"+i+" ").append(sum).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}
}
