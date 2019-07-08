import java.util.*;
import java.io.*;

public class CF1189A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String s = br.readLine();
		
		if(s.length() == 1) {
			pw.println(1);
			pw.println(s);
		}
		else {
			int zero = 0;
			int one = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '0')
					zero++;
				else
					one++;
			}
			
			if(zero != one) {
				pw.println(1);
				pw.println(s);
			}
			else {
				pw.println(2);
				pw.println(s.charAt(0) + " " + s.substring(1));
			}
		}
		
		pw.close();
	}
}