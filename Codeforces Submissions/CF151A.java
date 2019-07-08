import java.util.*;
import java.io.*;

public class CF151A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int k = Integer.parseInt(split[1]);
		int l = Integer.parseInt(split[2]);
		int c = Integer.parseInt(split[3]);
		int d = Integer.parseInt(split[4]);
		int p = Integer.parseInt(split[5]);
		int nl = Integer.parseInt(split[6]);
		int np = Integer.parseInt(split[7]);
		
		int numToasts = Math.min(k*l/nl, Math.min(c*d, p/np))/n;
		pw.println(numToasts);
		
		pw.close();
	}
}