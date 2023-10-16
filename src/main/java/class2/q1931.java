package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2];

		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine(), " ");

			meeting[i][0] = Integer.parseInt(st.nextToken());	// 회의 시작 시간
			meeting[i][1] = Integer.parseInt(st.nextToken());	// 회의 종료 시간
		}

		// meeting 을 meeting[i][1]을 기준으로 정렬
		Arrays.sort(meeting, (o1, o2) -> {
			// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});

		int count = 0;	// 회의 수를 저장할 변수
		int end = -1;	// 회의 종료시간을 비교할 변수

		for(int i=0; i<N; i++) {
			if (end <= meeting[i][0]) {
				end = meeting[i][1];
				count++;
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
