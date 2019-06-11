import java.util.*;
import java.io.*;

public class CF1030A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		
		boolean hard = false;
		for(String s : split)
			hard |= s.equals("1");
		
		if(hard)
			pw.println("HARD");
		else
			pw.println("EASY");
		
		pw.close();
	}
}
