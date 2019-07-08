import java.util.*;
import java.io.*;

public class CF990D {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int a = Integer.parseInt(split[1]);
		int b = Integer.parseInt(split[2]);
		
		if(n*a*b == 1)
			pw.println("YES\n0");
		else if(a*b == 1 && n <= 3)
			pw.println("NO");
		else if(Math.min(a, b) == 1) {
			pw.println("YES");
			int[][] arr = new int[n][n];
			
			int connect = n - Math.max(a, b);
			for(int i = 0; i < connect; i++) {
				arr[i][i+1] = 1;
				arr[i+1][i] = 1;
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j || b == 1)
						pw.print(arr[i][j]);
					else
						pw.print(1 - arr[i][j]);
				}
				pw.println();
			}
		}
		else
			pw.println("NO");
		
		pw.close();
	}
}