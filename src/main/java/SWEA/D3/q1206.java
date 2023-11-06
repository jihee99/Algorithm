package SWEA.D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class q1206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i<10; i++){
			int loop = Integer.parseInt(br.readLine());

			int[] height = new int[loop];

			for(int j = 0; j<loop; j++){
				height = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}

		}

	}
}
