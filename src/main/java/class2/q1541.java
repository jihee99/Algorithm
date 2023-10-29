package class2;

import java.io.*;
import java.util.StringTokenizer;

public class q1541 {
	public static void main(String[] agrs) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 초기값 설정
		int sum = Integer.MAX_VALUE;

		StringTokenizer sub = new StringTokenizer(br.readLine(),"-");

		while(sub.hasMoreTokens()){
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

			int temp = 0;

			while(add.hasMoreTokens()){
				temp += Integer.parseInt(add.nextToken());
			}

			if(sum == Integer.MAX_VALUE){
				sum = temp;
			}else{
				sum -= temp;
			}
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
