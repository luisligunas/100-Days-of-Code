import java.util.*;
import java.io.*;

public class CF451B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int[] arr = new int[Integer.parseInt(br.readLine()) + 2];
		arr[0] = -1;
		arr[arr.length - 1] = 1000000001;
		
		String[] split = br.readLine().split(" ");
		for(int i = 0; i < split.length; i++)
			arr[i + 1] = Integer.parseInt(split[i]);
		
		boolean increasing = true;
		ArrayList<Integer> changes = new ArrayList<>();
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(increasing && arr[i] > arr[i+1]) {
				increasing = false;
				changes.add(i - 1);
			}
			else if(!increasing && arr[i] < arr[i+1]) {
				increasing = true;
				changes.add(i);
			}
		}
		
		boolean valid = changes.size() == 2 &&
					arr[changes.get(0)] <= arr[changes.get(1)] && 
					arr[changes.get(0) + 1] <= arr[changes.get(1) + 1];
		if(valid) {
			pw.println("yes");
			pw.println((changes.get(0) + 1) + " " + changes.get(1));
		}
		else if(changes.isEmpty()) {
			pw.println("yes");
			pw.println("1 1");
			
		}
		else
			pw.println("no");
		pw.close();
	}
}