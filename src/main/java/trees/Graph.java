package main.java.trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Graph implementing BFS and DFS
 */

public class Graph {
	
	private int V;
	private LinkedList<Integer> adj[];	//Array of adjacency lists

	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	private void addEdge(int v, int w) {
		if(!adj[v].contains(w)){
			adj[v].add(w);
		}
	}
	
	public static void main(String args[]) {
		Graph g = new Graph(5);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.addEdge(3, 4);
		
		System.out.print("BFS: ");
		g.BFS(2);
		
		System.out.print("\nDFS: ");
		g.DFS(2);
		
		System.out.println("\nPath between 0->4 " + g.findPath(0, 4));
		System.out.println("\nPath between 4->1 " + g.findPath(4, 1));
	}
	
	// breadthFirstSearch implementing queue
	private void BFS(int s){
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[V];
		visited[s] = true;
		q.add(s);
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			Iterator<Integer> i = adj[u].iterator();
			while(i.hasNext()) {
				int v = i.next();
				if(!visited[v]) {
					visited[v] = true;
					q.add(v);
				}
			}
		}
	}
	
	/* 
	 * Using Stack instead of queue from BFS
	 */
	private void DFS(int s){
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited[] = new boolean[V];
		visited[s] = true;
		stack.add(s);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			System.out.print(u + " ");
			Iterator<Integer> i = adj[u].iterator();
			while(i.hasNext()) {
				int v = i.next();
				if(!visited[v]) {
					visited[v] = true;
					stack.add(v);
				}
			}
		}
	}
	
	//Implementing modified BFS
	private boolean findPath(int from, int to) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[V];
		visited[from] = true;
		q.add(from);
		while(!q.isEmpty()) {
			int u = q.poll();
//			System.out.print(u + " -> ");
			Iterator<Integer> i = adj[u].iterator();
			while(i.hasNext()) {
				int v = i.next();
				if(v == to) {
//					System.out.print(v);
					return true;
				}
				if(!visited[v]) {
					visited[v] = true;
					q.add(v);
				}
			}
		}
		
		return false;
	}
	
}
