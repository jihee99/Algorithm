package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class q10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			int current = Integer.parseInt(st.nextToken());

			if(hashMap.containsKey(current)){
				// 존재하는 경우, value + 1
				int currentValue = hashMap.get(current);
				hashMap.put(current, currentValue + 1);
			} else {
				// 존재하지 않는 경우, 값을 1로 초기화
				hashMap.put(current, 1);
			}
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++){
			int find = Integer.parseInt(st.nextToken());
			if(hashMap.containsKey(find)){
				sb.append(hashMap.get(find)).append(" ");
			}else{
				sb.append(0).append(" ");
			}
		}

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();

	}
}


