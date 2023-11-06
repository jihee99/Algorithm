package SWEA.D2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case<= loop; test_case++){

			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());


			int[][] board = new int[N][N];
			int[][] preSum = new int[N+1][N+1];


			for(int i=0; i<N; i++) {
				board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}


			// 누적합
			// for(int i=1; i<N+1; i++){
			// 	for(int j=1; j<N+1; j++){
			// 		preSum[i][j] = board[i-1][j-1] + preSum[i][j-1] + preSum[i-1][j] - preSum[i-1][j-1];
			// 	}
			// }
			//
			// int max = Integer.MIN_VALUE;
			// for(int i=1; i<=N-M+1; i++){
			// 	for(int j=1; j<=N-M+1; j++){
			// 		int sum = board[i][j] - preSum[i-1][j] - preSum[i][j-1] + preSum[i-1][j-1];
			// 		max  = Math.max(sum, max);
			// 	}
			// }


			int max = Integer.MIN_VALUE;
			for(int i=0; i<N-M+1; i++){
				for(int j=0; j<N-M+1; j++){
					int sum = 0;
					for(int k=i; k<i+M; k++){
						for(int l=j; l<j+M; l++){
							sum += board[k][l];
						}
					}
					max = Math.max(max, sum);
				}
			}

			// int[][] board = new int[m][m];
			// int[][] prefixSum = new int[m + 1][m + 1];
			// int max = Integer.MIN_VALUE;
			// for (int i = 0; i < m; i++) {
			// 	board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			// }
			// for (int i = 1; i < m + 1; i++) {
			// 	for (int j = 1; j < m + 1; j++) {
			// 		prefixSum[i][j] = board[i - 1][j - 1] + prefixSum[i][j - 1] + prefixSum[i - 1][j] - prefixSum[i -1][j - 1];
			// 	}
			// }
			//
			// for (int i = 1; i <= m - n + 1; i++) {
			// 	for (int j = 1; j <= m - n + 1; j++) {
			// 		int sum = prefixSum[n + i - 1][n + j - 1] - prefixSum[n + i - 1][j - 1] - prefixSum[i - 1][n + j - 1] + prefixSum[i - 1][j - 1];
			// 		max = Math.max(sum, max);
			// 	}
			// }

			sb.append("#").append(test_case).append(" ").append(max).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
