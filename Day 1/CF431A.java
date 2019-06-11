import java.util.*;
import java.io.*;

public class CF431A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int[] a = new int[4];
		for(int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(split[i]);
		
		char[] arr = br.readLine().toCharArray();
		int count = 0;
		for(char c : arr)
			count += a[c - '1'];
		pw.println(count);
		
		pw.close();
	}
	
}
