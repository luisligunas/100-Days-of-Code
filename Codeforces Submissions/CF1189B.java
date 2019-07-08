import java.util.*;
import java.io.*;

public class CF1189B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		br.readLine();
		String[] split = br.readLine().split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < split.length; i++)
			arr.add(Integer.parseInt(split[i]));
		Collections.sort(arr);
		
		ArrayList<Integer> out = new ArrayList<>();
		out.add(arr.get(arr.size() - 2));
		out.add(arr.get(arr.size() - 1));
		out.add(arr.get(arr.size() - 3));
		for(int i = 0; i < arr.size() - 3; i++)
			out.add(arr.get(i));
		
		boolean rekt = false;
		for(int i = 0; i < out.size(); i++) {
			if(out.get((i-1+out.size())%out.size()) + out.get((i+1)%out.size()) <= out.get(i)) {
				rekt = true;
				break;
			}
		}
		
		if(rekt)
			pw.println("NO");
		else {
			pw.println("YES");
			for(int i = 0; i < out.size(); i++) {
				if(i != 0)
					pw.print(" ");
				pw.print(out.get(i));
			}
			pw.println();
		}
		
		pw.close();
	}
}