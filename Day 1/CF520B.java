import java.util.*;
import java.io.*;

public class CF520B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		boolean[] added = new boolean[20001];
		Queue<State> q = new LinkedList<>();
		q.add(new State(n, 0));
		
		int min = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			State s = q.remove();
			
			if(added[s.n])
				continue;
			added[s.n] = true;
			
			if(s.n >= m) {
				min = Math.min(min, s.dist + (s.n - m));
				continue;
			}
			if(s.n > 1)
				q.add(new State(s.n - 1, s.dist + 1));
			q.add(new State(s.n * 2, s.dist + 1));
		}
		
		pw.println(min);
		
		pw.close();
	}
	
	public static class State {
		int n, dist;
		
		public State(int n, int dist) {
			this.n = n;
			this.dist = dist;
		}
	}
}


