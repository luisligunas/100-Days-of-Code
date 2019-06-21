import java.util.*;
import java.io.*;

public class CF791A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		long a = Long.parseLong(split[0]);
		long b = Long.parseLong(split[1]);
		
		int count = 0;
		while(a <= b) {
			a *= 3;
			b *= 2;
			count++;
		}
		
		pw.println(count);
		
		pw.close();
	}
}
