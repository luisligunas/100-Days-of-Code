import java.util.*;
import java.io.*;

public class CF785A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		
		String[] polyhedrons = {"Tetrahedron", "Cube", "Octahedron", "Dodecahedron", "Icosahedron"};
		int[] faces = {4, 6, 8, 12, 20};
		
		long total = 0;
		while(n-- > 0) {
			String g = br.readLine();
			
			for(int i = 0; i < polyhedrons.length; i++) {
				if(polyhedrons[i].equals(g)) {
					total += faces[i];
					break;
				}
			}
		}
		
		pw.println(total);
		
		pw.close();
	}
}
