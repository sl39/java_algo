package week2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1182 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i =0; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		
		for (int i = 1; i < 1<<n; i++) {
			int res = 0;
			for (int j = 0 ; j< n; j ++) {
				int b = 1 << j;
				int c = i&b;
				if ( c > 0) {
					res += arr[j];
					
				}
			}
			if (res== s) {
				cnt += 1;

			}
		}
		
		System.out.println(cnt);
	}

}
