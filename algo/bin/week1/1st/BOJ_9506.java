package week1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class BOJ_9506 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			ArrayList<Integer> arr =new ArrayList<Integer>();
			int a = Integer.parseInt(br.readLine());

			if (a==-1) {
				break;
			}
			int mys = 0;
			int cnt = 0;
			for (int i=1; i<a ; i++) {
				if (a%i==0) {
					arr.add(i);
					cnt += 1;

				}
			
			}
			int k = 0;
			for (Integer I : arr) {
				mys += I;
			
			}
			if (mys==a) {
				System.out.print(String.format("%d = ", a));
				
				for (Integer I : arr) {
					System.out.print(String.format("%d ",I));
					k += 1;
					if (k!=cnt) {
						System.out.print("+ ");
					}
				}
				
				
			}
			else {
				System.out.println(String.format("%d is NOT perfect.", a));
				}
		}
		
	}

}