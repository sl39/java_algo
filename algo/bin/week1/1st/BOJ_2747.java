import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2747 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a+1];
		arr[0] = 0;
		arr[1] = 1;
		int t = 2;
		while (t<=a) {
			arr[t] = arr[t-1] + arr[t-2];
			t = t + 1;
		}
		System.out.println(arr[a]);
	}

}
