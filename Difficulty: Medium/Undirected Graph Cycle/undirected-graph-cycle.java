class Pair {
    int parent;
    int child;

    Pair(int child, int parent) {
        this.parent = parent;
        this.child = child;
    }
}

class Solution {

    public boolean bfs(int start,
                       ArrayList<ArrayList<Integer>> ans,
                       boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(start, -1));
        visited[start] = true;

        while (!q.isEmpty()) {

            Pair front = q.remove();

            int val = front.child;
            int par = front.parent;

            for (int nval : ans.get(val)) {

                // Ignore the edge through which we reached this node
                if (nval == par) {
                    continue;
                }

                // Already visited through some other path => cycle
                if (visited[nval]) {
                    return true;
                }

                visited[nval] = true;
                q.add(new Pair(nval, val));
            }
        }

        return false;
    }

    public boolean isCycle(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            ans.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            ans.get(a).add(b);
            ans.get(b).add(a);
        }

        boolean[] visited = new boolean[V];

        // Check every connected component
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (bfs(i, ans, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}