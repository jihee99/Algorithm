package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] origin = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			origin[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(origin);
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M ; i++){
			int key = Integer.parseInt(st.nextToken());

			if(binarySearch(origin, key) >= 0){
				// 해당 수가 origin에 존재할 때
				sb.append(1).append("\n");
			}else{
				// 해당 수가 origin에 존재하지 않을 때
				sb.append(0).append("\n");
			}
		}

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}

	public static int binarySearch(int[] arr, int key){
		int start = 0;
		int end = arr.length - 1;
		// start가 end 보다 커지기 전까지 반복
		while(start <= end){
			int mid = (start + end) / 2;

			// key가 arr[mid]보다 클 때
			if(key > arr[mid]){start = mid + 1;}
			// key보다 arr[mid]가 클 때
			else if(key < arr[mid]){end = mid - 1;}
			// key와 arr[mid]가 같을 때
			else{return mid;}

		}
		return -1;
	}
}
