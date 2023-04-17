import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BOJ_24723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(1<<n);
	}

}
