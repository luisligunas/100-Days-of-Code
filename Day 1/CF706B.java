import java.util.*;
import java.io.*;

public class CF706B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		
		int[] prices = new int[split.length];
		for(int i = 0; i < split.length; i++)
			prices[i] = Integer.parseInt(split[i]);
		Arrays.sort(prices);
		
		int q = Integer.parseInt(br.readLine());
		while(q-- > 0) {
			int m = Integer.parseInt(br.readLine());
			
			int left = -1;
			int right = prices.length;
			
			while(right - left >= 2) {
				int mid = (left + right) / 2;
				
				if(prices[mid] <= m)
					left = mid;
				else
					right = mid;
			}
			
			pw.println(right);
		}
		
		pw.close();
	}
	
}
