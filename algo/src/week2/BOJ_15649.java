package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649{
    public static int n, m;
    public static int[] arr; // 값을 담을 배열
    public static boolean[] visit; // 방문 여부
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열 모두 찾기

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n+1];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int cnt){

        if(cnt == m){
            for(int val:arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++){
            if(!visit[i]){ // 해당 값을 방문하지 않았따면
                visit[i] = true; // 방문 상태로 변경
                arr[cnt] = i; // cnt의 인덱스에 i저장
                dfs(cnt+1);
                visit[i] = false; // 자식 노드 방문이 끝나고 돌아오면 방문 상태를 false로 변경
            }
        }
    }
}