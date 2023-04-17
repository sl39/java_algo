import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BOJ_1037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(br.readLine());
		
		int[] arr = new int [a];
		
		

		for (int i= 0; i<a ; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			
			
		}
		
		int mx = arr[0];
		int my = arr[0];
		
		for(int i=1; i<a ; i++) {
			if(mx < arr[i]) mx = arr[i];
			if (my > arr[i]) my = arr[i];
		}
		System.out.println(mx *my);
		}
	}
