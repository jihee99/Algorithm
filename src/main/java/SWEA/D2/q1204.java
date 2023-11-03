package SWEA.D2;

import java.io.*;
import java.util.*;

public class q1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<=loop; i++){
			int idx = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());

			int[] count = new int[101];

			for(int j=0; j<1000; j++){
				int score = Integer.parseInt(st.nextToken());
				count[score] ++;
			}

			int max = Integer.MIN_VALUE;
			int maxIdx = 0;
			for(int j=0; j<count.length; j++){
				if(count[j] > max){
					max = count[j];
					maxIdx = j;
				}

				if((count[j] == max) && (j > maxIdx) ){
					max = count[j];
					maxIdx = j;
				}
			}
			sb.append("#").append(idx).append(" ").append(maxIdx).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
