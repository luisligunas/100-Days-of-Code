import java.util.*;
import java.io.*;

public class CF574B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		ArrayList<Node> nodes = new ArrayList<>();
		boolean[][] edge = new boolean[n][n];
		int[] count = new int[n];
		
		for(int i = 0; i < n; i++)
			nodes.add(new Node(i));
		
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]) - 1;
			int b = Integer.parseInt(split[1]) - 1;
			
			count[a]++;
			count[b]++;
			edge[a][b] = true;
			edge[b][a] = true;
			nodes.get(Math.min(a, b)).neigh.add(Math.max(a,b));
		}
		
		int min = Integer.MAX_VALUE;
		boolean found = false;
		for(Node node : nodes) {
			if(count[node.ind] < 2)
				continue;
			
			for(int i = 0; i < node.neigh.size(); i++) {
				for(int j = i+1; j < node.neigh.size(); j++) {
					int a = node.neigh.get(i);
					int b = node.neigh.get(j);
					if(edge[a][b]) {
						min = Math.min(min, count[a] + count[b] + count[node.ind] - 6);
						found = true;
					}
				}
			}
		}
		if(found)
			pw.println(min);
		else
			pw.println(-1);
		
		pw.close();
	}
	public static class Node {
		int ind;
		ArrayList<Integer> neigh = new ArrayList<>();
		
		public Node(int ind) {
			this.ind = ind;
		}
	}
}