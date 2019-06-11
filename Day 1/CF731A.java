import java.util.*;
import java.io.*;

public class CF731A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		char[] arr = br.readLine().toCharArray();
		
		int curr = 'a';
		int count = 0;
		
		for(char c : arr) {
			int temp = (curr - c + 26) % 26;
			count += Math.min(temp, 26 - temp);
			curr = c;
		}
		
		pw.println(count);
		
		pw.close();
	}
}
