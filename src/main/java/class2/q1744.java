package class2;

import java.io.*;
import java.util.*;

public class q1744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<>();
		PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> zeroPriorityQueue = new PriorityQueue<>();
		PriorityQueue<Integer> onePriorityQueue = new PriorityQueue<>();

		int sum = 0;

		for(int i=0; i<N; i++){
			int current = Integer.parseInt(br.readLine());

			if(current > 1) plusPriorityQueue.add(current);
			else if(current == 1) onePriorityQueue.add(current);
			else if(current == 0) zeroPriorityQueue.add(current);
			else minusPriorityQueue.add(current);
		}

		while(plusPriorityQueue.size() > 1){
			int tmp1 = plusPriorityQueue.remove();
			int tmp2 = plusPriorityQueue.remove();

			int result = tmp1 * tmp2;
			sum += result;
		}
		if(!plusPriorityQueue.isEmpty()){
			sum += plusPriorityQueue.remove();
		}

		while(minusPriorityQueue.size() > 1){
			int tmp1 = minusPriorityQueue.remove();
			int tmp2 = minusPriorityQueue.remove();
			int result = tmp1 * tmp2;
			sum += result;
		}
		if((!minusPriorityQueue.isEmpty()) && zeroPriorityQueue.isEmpty()) {
			sum += minusPriorityQueue.remove();
		}

		if(!onePriorityQueue.isEmpty()){
			sum += onePriorityQueue.size();
		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
