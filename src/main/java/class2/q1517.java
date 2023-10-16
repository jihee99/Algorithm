package class2;

import java.io.*;

// 8
// 3 2 8 1 7 4 5 6

public class q1517 {

    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];

        for(int i=0; i<loop; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(swap(arr));
        bw.flush();
        bw.close();
    }

    public static int mergeSort(int[] arr, int left, int right){

        if(left < right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

        }




        return 0;

    }

    public static int swap(int[] arr){

        int count = 0;
        int index = 0;

        while(index+1 <= arr.length){
            if(arr[index] > arr[index+1]){
                int tmp = arr[index+1];
                arr[index+1] = arr[index];
                arr[index] = tmp;

                index++;
                count++;
            }
        }
        return count;
    }
}
