import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10001];
        int n = Integer.parseInt(br.readLine().trim());

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            arr[num] ++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=1; i<=10000; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) bw.write(i + "\n");
            }
        }

        bw.flush(); // 버퍼를 비워주는 작업이 필요
    }
}
