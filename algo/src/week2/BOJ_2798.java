package week2;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class BOJ_2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int mx = 0;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i=0; i<n-2;i++) {
			for (int j = i+1; j<n-1;j++) {
				for (int k = j+1; k<n; k++) {
					int cnt = arr[i] + arr[j] + arr[k];
					if (mx < cnt && cnt <= m) {
						mx = cnt;
					}
				}
			}
		}
		System.out.println(mx);
	}

}
