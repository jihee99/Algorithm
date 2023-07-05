package class2;

// 길이가 짧은 것부터
// 길이가 같으면 사전 순으로

import java.io.*;
import java.util.*;

public class q1181 {

//    public static String[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());

//        arr = new String[c];
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<c; i++){
//            arr[i] = br.readLine();
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);

//        기본식
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return 1;
//                }else if(o1.length() < o2.length()){
//                    return -1;
//                } else{
//                    return o1.compareTo(o2);
//                }
//            }
//        });

//        람다식
        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}