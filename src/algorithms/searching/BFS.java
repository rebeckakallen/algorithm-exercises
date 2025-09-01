
package algorithms.searching;

public class BFS {

	public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj){

		int l = adj.size;
		boolean[] visited = new boolean[l];
		ArrayList<Integer> result = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();

		int s = 0;

		visited[s] = true;
		queue.add(s);

		while(!queue.isEmpty()){
			int curr = queue.poll();
			res.add(curr);

			for(int a : adj.get(curr)){
				if(visited[a] == false){
					visited[a] = true;
					queue.add(a);
				}
			}
		}
	}
}
