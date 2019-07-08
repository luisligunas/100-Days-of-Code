import java.util.*;
import java.io.*;

public class CF330B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		ArrayList<Node> nodes = new ArrayList<>();
		for(int i = 0; i < n; i++)
			nodes.add(new Node(i));
		
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]) - 1;
			int b = Integer.parseInt(split[1]) - 1;
			nodes.get(a).cant.add(b);
			nodes.get(b).cant.add(a);
		}
		
		Node minNode = nodes.get(0);
		for(Node node : nodes) {
			if(node.cant.size() < minNode.cant.size())
				minNode = node;
		}
		
		ArrayList<String> out = new ArrayList<>();
		for(Node node : nodes) {
			if(node == minNode)
				continue;
			if(minNode.cant.contains(node.ind)) {
				//cant
				int mex = mex(node.cant, nodes.size() - 1, node.ind);
				out.add((node.ind + 1) + " " + (mex + 1));
			}
			else
				out.add((minNode.ind + 1) + " " + (node.ind + 1));
		}
		
		pw.println(out.size());
		for(String s : out)
			pw.println(s);
		
		pw.close();
	}
	
	public static int mex(ArrayList<Integer> list, int max, int ex) {
		list.add(ex);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)
			if(i != list.get(i))
				return i;
		if(list.get(list.size() - 1) == max)
			return -1;
		return max;
	}
	
	public static class Node {
		int ind;
		ArrayList<Integer> cant = new ArrayList<>();
		
		public Node(int ind) {
			this.ind = ind;
		}
	}
}