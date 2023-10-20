package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q13398 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		int[] origin = new int[loop];
		int[] left = new int[loop];
		int[] right = new int[loop];
		int result;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<loop; i++){
			origin[i] = Integer.parseInt(st.nextToken());
		}

		left[0] = origin[0];
		result = left[0];
		for(int i=1; i<loop; i++){
			left[i] = Math.max(origin[i], left[i-1] + origin[i]);
			result = Math.max(result, left[i]);		// 한 개도 제거하지 않았을 때를 기본 최대값으로 저장
		}

		right[loop-1] = origin[loop-1];
		for(int i=loop-2; i>=0; i--){
			right[i] = Math.max(origin[i], right[i+1] + origin[i]);
		}

		for(int i=1; i<loop-1; i++){
			int temp = left[i-1] + right[i+1];
			result = Math.max(result, temp);
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();


	}
}
