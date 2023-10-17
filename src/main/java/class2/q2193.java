package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2193 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		long[][] arr = new long[count+1][2];

		arr[1][0] = 0;
		arr[1][1] = 1;
		for(int i=2; i<=count; i++){
			arr[i][0] = arr[i-1][0] + arr[i-1][1];
			arr[i][1] = arr[i-1][0];
		}

		bw.write(String.valueOf(arr[count][0] + arr[count][1]));
		bw.flush();
		bw.close();
	}
}
