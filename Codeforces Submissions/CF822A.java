import java.util.*;
import java.io.*;

public class CF822A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		long a = Long.parseLong(split[0]);
		long b = Long.parseLong(split[1]);
		
		pw.println(factorial(Math.min(a, b)));
		
		pw.close();
	}
	public static long factorial(long n) {
		long prod = 1;
		for(long i = 2; i <= n; i++)
			prod *= i;
		return prod;
	}
}