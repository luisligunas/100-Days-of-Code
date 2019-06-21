import java.util.*;
import java.io.*;

public class CF466C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		
		long[] arr = new long[split.length];
		for(int i = 0; i < arr.length; i++)
			arr[i] = Long.parseLong(split[i]);
		
		long[] sum = new long[arr.length];
		long[] revSum = new long[arr.length];
		sum[0] = arr[0];
		revSum[arr.length - 1] = arr[arr.length - 1];
		for(int i = 1; i < sum.length; i++)
			sum[i] = sum[i-1] + arr[i];
		for(int i = revSum.length - 2; i >= 0; i--)
			revSum[i] = revSum[i+1] + arr[i];
		
		if(sum[sum.length - 1] % 3 != 0)
			pw.println(0);
		else {
			long div3 = sum[sum.length - 1] / 3;
			long count = 0;
			ArrayList<Integer> leftInd = new ArrayList<>();
			ArrayList<Integer> rightInd = new ArrayList<>();
			
			for(int i = 0; i < sum.length; i++) {
				if(sum[i] == div3)
					leftInd.add(i);
				if(revSum[i] == div3)
					rightInd.add(i);
			}
			
			int a = 0;
			int b = 0;
			
			while(a < leftInd.size() && b < rightInd.size()) {
				if(rightInd.get(b) - leftInd.get(a) < 2) {
					b++;
					continue;
				}
				count += (long) (rightInd.size() - b);
				a++;
			}
			
			pw.println(count);
		}
		
		pw.close();
	}
	
}
