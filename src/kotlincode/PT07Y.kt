package kotlincode

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * Solution to SPOJ problem PT07Y
 * @see <a href="http://www.spoj.com/problems/PT07Y/">http://www.spoj.com/problems/PT07Y/</a>
 * @author Shahbaz Ahmed
 * Given an undirected and unweighted graph, find whether it is a tree.
 * In this solution, I have used DFS approach to find cyclicity in graph.
 */ 
fun main(a: Array<String>) {
	var br = BufferedReader(InputStreamReader(System.`in`))
	var st = StringTokenizer(br.readLine())
	var n = st.nextToken().toInt()
	var m = st.nextToken().toInt()
	// Adjacency list
	var adj = Array(n, {arrayListOf<Int>()})
			
	for (i in 0..m-1) {
		st = StringTokenizer(br.readLine())
		var u = st.nextToken().toInt() - 1
		var v = st.nextToken().toInt() - 1
		adj[u].add(v)
		adj[v].add(u)
	}
	if (isTree(adj, n, m)) 
		println("YES")
	else
		println("NO")
}

fun isTree(adj: Array<ArrayList<Int>>, n: Int, m: Int): Boolean  {
	if (m != n-1 || n<=1 ) {
		return false
	}
	var visited = BooleanArray(n)
	for (i in 0..n-1)
		visited[i] = false
	// Check for cyclicity, pass current node as 0 and parent as -1 since root node
 	// doesn't have parent
	if (isCyclic(0, -1, visited, adj)) return false
	
	// Check if graph is connected. Here if all vertices are visited then the graph
	// is connected
	for (i in 0..n-1) {
		if (!visited[i]) return false
	}
	return true
}

/*
 Modified DFS implementation to detect cyclic edges in a given graph.
 The basic idea is: if the neighbour(say v) of a given vertex (say u) is already visited
 and v is not the parent of u then there is a cycle in the given graph
*/
fun isCyclic(u: Int, parent: Int, visited: BooleanArray, adj: Array<ArrayList<Int>>): Boolean {
		visited[u] = true
		for (i in adj[u]) {
			if(!visited[i]) {
					// println("visiting vertex: $u")
					isCyclic(i, u, visited, adj)
				} else if (visited[i] && i != parent) {
					return true
				}
		}
	return false
}

