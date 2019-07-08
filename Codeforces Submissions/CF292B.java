import java.util.*;
import java.io.*;

public class CF292B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		int[] freq = new int[n];
		boolean star = false;
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]) - 1;
			int b = Integer.parseInt(split[1]) - 1;
			freq[a]++;
			freq[b]++;
		}
		if(isStar(freq))
			pw.println("star topology");
		else if(isRing(freq))
			pw.println("ring topology");
		else if(isBus(freq))
			pw.println("bus topology");
		else
			pw.println("unknown topology");
		
		
		pw.close();
	}
	
	public static boolean isStar(int[] freq) {
		int notOne = 0;
		for(int i : freq) {
			if(i > 1)
				notOne++;
			else if(i == 0)
				return false;
		}
		return notOne == 1;
	}
	
	public static boolean isRing(int[] freq) {
		for(int i : freq) {
			if(i != 2)
				return false;
		}
		return true;
	}
	
	public static boolean isBus(int[] freq) {
		int one = 0;
		for(int i : freq) {
			if(i == 1)
				one++;
			else if(i != 2)
				return false;
		}
		return one == 2;
	}
	
}