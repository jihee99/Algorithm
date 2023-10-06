package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		/*
		 *  sum = 총 합계
		 *  max = 최댓값
		 *  min = 최솟값
		 *  median = 중앙값
		 *  mode = 최빈값
		 */
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<N; i++){

			int value = Integer.parseInt(br.readLine());

			sum += value;
			list.add(value);

			if(max < value){
				max = value;
			}

			if(min > value){
				min = value;
			}
		}

		Collections.sort(list);

		int median = 10000;
		int mode = 10000;

		int modeMax = 0;      // 최빈값의 최대
		boolean flag = false;

		ListIterator<Integer>iterator = list.listIterator();
		while(iterator.hasNext()){

		}

		sb.append((int)Math.round((double)sum / N)).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max - min).append("\n");

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}


}