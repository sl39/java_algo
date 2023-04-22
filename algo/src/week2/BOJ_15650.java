package week2;

import java.io.*;
import java.util.*;

public class BOJ_15650 {
	
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		comb(1,0);
		System.out.print(sb);
		
		
		
	}
	public static void comb(int i, int depth ) {
		if(depth == m) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		if(i== n+1) {
			return;
		}
		
		arr[depth] = i;
		comb(i+1, depth+1 );
		comb(i+1, depth );
	}
	
}
