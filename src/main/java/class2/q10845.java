package class2;

import java.io.*;
import java.util.StringTokenizer;

public class q10845 {

    public static int[] queue;
    public static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int count = Integer.parseInt(br.readLine());
        queue = new int[count];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            if(order.equals("pop")){
                sb.append(pop()).append('\n');
            }
            if(order.equals("size")) {
                sb.append(size()).append('\n');
            }
            if(order.equals("empty")){
                sb.append(empty()).append('\n');
            }
            if(order.equals("front")){
                sb.append(front()).append('\n');
            }
            if(order.equals("back")){
                sb.append(back()).append('\n');
            }
        }
    }

    public static void push(int num){
        queue[size] = num;
        size++;
    }

    public static int pop(){
        if(size==0) return -1;
        else{
            int result = queue[0];
            int tmp;
            for(int j = 1; j <= size; j++) {
                tmp = queue[j];
                queue[j - 1] = tmp;
                queue[j] = 0;
            }
            return result;
        }
    }

    public static int size(){
        return 0;
    }

    public static int empty(){
        return 0;
    }

    public static int front(){
        return 0;
    }

    public static int back(){
        return 0;
    }
}
