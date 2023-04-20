package week2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
public class BOJ_10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < k ; i ++) {
			int c = Integer.parseInt(br.readLine());
			if (c == 0) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		int mys = 0;
		for (int num:stack) {
			mys += num;
		}
		System.out.println(mys);

	}

}
