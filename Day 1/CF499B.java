import java.util.*;
import java.io.*;

public class CF499B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		HashMap<String, String> map = new HashMap<>();
		while(m-- > 0) {
			split = br.readLine().split(" ");
			if(split[0].length() <= split[1].length())
				split[1] = split[0];
			map.put(split[0], split[1]);
		}
		split = br.readLine().split(" ");
		
		for(int i = 0; i < split.length; i++) {
			if(i != 0)
				pw.print(" ");
			pw.print(map.get(split[i]));
		}
		pw.println();
		
		pw.close();
	}
	
}
