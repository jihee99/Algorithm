package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q14501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int leave = Integer.parseInt(br.readLine());

		int[] money = new int[leave+1];
		int[] day = new int[leave+1];
		int[] pay= new int[leave+1];

		StringTokenizer st;
		for(int i=0; i<leave; i++){
			st = new StringTokenizer(br.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			pay[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<leave; ++i) {
			if(i+day[i] <= leave) {
				money [i+day[i]] = Math.max(money[i+day[i]], money[i]+pay[i]);
			}
			money[i+1] = Math.max(money[i+1], money[i]);
		}

		bw.write(String.valueOf(money[leave]));
		bw.flush();
		bw.close();
	}
}
