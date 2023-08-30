package class2;

import java.io.*;
import java.util.Arrays;

public class q1377 {
    public static void main(String[] args) throws IOException {

//        정수형 변수 N 선언
//        정수형 배열 intArr = new intArr[N]
//
//        for(N번 반복)
//            intArr 배열에 저장
//
//        intArr 배열 정렬
//        for(N번 반복)
//            intArr의 정렬 전 index - intArr의 정렬 후 index
//
//        최대값 + 1 출력
//
//                ** 별도의 클래스
//        indexPair
//                index, value
//        value를 기준으로 오름차순 정렬 함수 Compare 구현

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        Pair[] pairs = new Pair[N];

        for(int i=0; i<N; i++){
            pairs[i] = new Pair(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(pairs);


        int result = 0;
        for(int i=0; i<N; i++){
            if(result < pairs[i].index - i){
                result = pairs[i].index - i;
            }
        }
        bw.write(String.valueOf(result+1));
        bw.flush();
        bw.close();

    }

    static class Pair implements Comparable<Pair> {

        int index;
        int value;

        public Pair(int index, int value) {
            super();
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
        }

    }

}
