package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[][] arr = new String[N][2];
		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}

		// comparator
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {

				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				// if (o1[0] == o2[0])
				// 	return o1[1].compareTo(o2[1]);
				// else {
				// 	return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				// }
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++){
			sb.append(toString(arr[i])).append("\n");
		}

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();

	}

	public static String toString(String[] str){
		return str[0] + " " + str[1];
	}
}

