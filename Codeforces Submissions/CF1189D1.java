import java.util.*;
import java.io.*;

public class CF1189D1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] freq = new int[n];
		
		for(int i = 0; i < n - 1; i++) {
			String[] split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]) - 1;
			int b = Integer.parseInt(split[1]) - 1;
			
			freq[a]++;
			freq[b]++;
		}
		boolean rekt = false;
		for(int i : freq) {
			if(i == 2) {
				rekt = true;
				break;
			}
		}
		if(rekt)
			pw.println("NO");
		else
			pw.println("YES");
		
		pw.close();
	}
}