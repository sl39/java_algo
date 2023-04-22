package week2;

import java.io.*;
import java.util.*;

public class BOJ_15655 {
	
	public static int n;
	public static int m;
	public static int[] arr;
	public static int[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void dfs(int depth, int idx) {
		if (depth == m) {
			for(int val : visited) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		if (idx == n) return;
		
		visited[depth] = arr[idx];
		dfs(depth+1,idx+1);
		dfs(depth,idx+1);
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		visited = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < n; i++) {
			int ans = Integer.parseInt(st.nextToken());
			arr[i] = ans;
		}
		Arrays.sort(arr);
		dfs(0,0);
		System.out.println(sb);

	}

}
