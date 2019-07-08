import java.util.*;
import java.io.*;

public class CF1189C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		
		int[] arr = new int[split.length];
		for(int i = 0; i < split.length; i++)
			arr[i] = Integer.parseInt(split[i]);
		
		int[] sum = new int[arr.length];
		sum[0] = arr[0];
		for(int i = 1; i < sum.length; i++)
			sum[i] = sum[i-1] + arr[i];
		
		int q = Integer.parseInt(br.readLine());
		while(q-- > 0) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]) - 1;
			int b = Integer.parseInt(split[1]) - 1;
			
			if(a == 0)
				pw.println(sum[b]/10);
			else
				pw.println((sum[b] - sum[a-1])/10);
		}
		
		
		pw.close();
	}
	
}