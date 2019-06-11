import java.util.*;
import java.io.*;

public class CF550A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String g = br.readLine();
		int i1 = g.indexOf("AB");
		int i2 = g.lastIndexOf("AB");
		int j1 = g.indexOf("BA");
		int j2 = g.lastIndexOf("BA");
		
		boolean found = i1 != -1 && j1 != -1;
		found &= (Math.abs(i2 - j1) >= 2 || Math.abs(j2 - i1) >= 2);
		
		if(found)
			pw.println("YES");
		else
			pw.println("NO");
		
		pw.close();
	}
}
