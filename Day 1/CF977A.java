import java.util.*;
import java.io.*;

public class CF977A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		long n = Long.parseLong(split[0]);
		int k = Integer.parseInt(split[1]);
		
		while(k-- > 0) {
			if(n % 10 == 0)
				n /= 10;
			else
				n--;
		}
		
		pw.println(n);
		
		pw.close();
	}
}
