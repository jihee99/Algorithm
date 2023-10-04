package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class q2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 리스트에 숫자넣기
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		// 오름차순 정렬
		Collections.sort(list);
		// 출력
		for(int value : list) {
			sb.append(value).append('\n');
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}

}
