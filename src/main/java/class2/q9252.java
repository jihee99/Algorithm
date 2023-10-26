package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class q9252 {

	private static long[][] DP;
	private static ArrayList<Character> Path;
	private static char[] CharArr1;
	private static char[] CharArr2;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		CharArr1 = br.readLine().toCharArray();
		CharArr2 = br.readLine().toCharArray();

		DP = new long[CharArr1.length+1][CharArr2.length+1];
		Path = new ArrayList<Character>();
		for(int i=1; i <= CharArr1.length; i++){
			for(int j=1; j<=CharArr2.length; j++){
				if(CharArr1[i-1] == CharArr2[j-1]){
					DP[i][j] = DP[i-1][j-1] + 1;
				}else{
					DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
				}
			}
		}

		StringBuilder result = new StringBuilder();

		result.append(DP[CharArr1.length][CharArr2.length]).append("\n");
		getText(CharArr1.length, CharArr2.length);
		for(int i=Path.size()-1; i>=0; i--){
			result.append(Path.get(i));
		}

		bw.write(result.toString());
		bw.flush();
		bw.close();


	}

	private static void getText(int r, int c){
		if(r==0 || c==0) return;
		if(CharArr1[r-1] == CharArr2[c-1]){
			Path.add(CharArr1[r-1]);
			getText(r-1,c-1);
		} else {
			if(DP[r-1][c] > DP[r][c-1]){
				getText(r-1, c);
			}else{
				getText(r, c-1);
			}
		}
	}

}
