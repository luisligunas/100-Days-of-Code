import java.util.*;
import java.io.*;

public class CF115A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int numEmp = Integer.parseInt(br.readLine());
		
		ArrayList<Node> nodes = new ArrayList<>();
		for(int i = 0; i < numEmp; i++)
			nodes.add(new Node());
		
		for(int i = 0; i < numEmp; i++) {
			int parent = Integer.parseInt(br.readLine()) - 1;
			if(parent == -2) {
				nodes.get(i).root = true;
				continue;
			}
			nodes.get(parent).children.add(nodes.get(i));
		}
		
		int max = 0;
		for(Node node : nodes)
			if(node.root)
				max = Math.max(max, depth(node));
		pw.println(max);
		
		pw.close();
	}
	
	public static class Node {
		static boolean root = false;
		ArrayList<Node> children = new ArrayList<>();
	}
	
	public static int depth(Node node) {
		int max = 0;
		
		for(Node child : node.children)
			max = Math.max(max, depth(child));
		
		return max + 1;
	}
}