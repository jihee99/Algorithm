package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q10844 {
	static long mod = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[][] stairs= new long[N+1][10];

		for(int i=1; i<=9; i++){
			stairs[1][i] = 1;
		}

		for(int i=2; i<=N; i++){
			for(int j=0; j<=9; j++){
				if(j == 0){
					stairs[i][0] = stairs[i-1][j+1]% mod;
				} else if(j == 9) {
					stairs[i][9] = stairs[i-1][j-1]% mod;
				} else {
					stairs[i][j] = (stairs[i-1][j-1] + stairs[i-1][j+1]) % mod;
				}

			}
		}

		long sum = 0;
		for(int i=0; i < 10; i++){
			sum += stairs[N][i];
		}
		sum = sum%mod;

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
