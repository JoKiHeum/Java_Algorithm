import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_01753_최단경로 {
	static class Edge implements Comparable<Edge> {
		int V;
		int W;
		int weight;
		
		public Edge(int v, int w, int weight) {
			super();
			this.V = v;
			this.W = w;
			this.weight= weight;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.weight, o.weight);
			
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	
}
