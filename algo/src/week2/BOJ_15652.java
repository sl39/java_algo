package week2;

import java.io.*;
import java.util.*;

public class BOJ_15652 {
	
	public static int n;
	public static int m;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(0,1);
		System.out.println(sb);
		

	}

	public static void dfs(int depth, int i) {
		if (depth == m) {
			for(int val:arr) {
				sb.append(val).append(" ");
				
			}
			sb.append("\n");
			return;
			}
		
		for(int k = i; k<=n ; k++) {
			arr[depth] = k;
			dfs(depth +1,k);
		}
		
	}
}
