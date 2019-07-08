import java.util.*;
import java.io.*;

public class CF363B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int k = Integer.parseInt(br.readLine().split(" ")[1]);
		String[] split = br.readLine().split(" ");
		
		long[] h = new long[split.length];
		for(int i = 0; i < h.length; i++)
			h[i] = Long.parseLong(split[i]);
		
		long min = 0;
		int minInd = 0;
		for(int i = 0; i < k; i++)
			min += h[i];
		
		long running = min;
		for(int i = 1; i < h.length - k + 1; i++) {
			running += h[i + k - 1] - h[i-1];
			if(running < min) {
				min = running;
				minInd = i;
			}
		}
		
		pw.println(minInd + 1);
		pw.close();
	}
}