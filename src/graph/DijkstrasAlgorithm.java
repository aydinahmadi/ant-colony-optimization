//To do
//1.understand the algoritm
//2.add destination
//3.get the passes into an array;
//4.ui





package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DijkstrasAlgorithm { 

int v;
    public DijkstrasAlgorithm(int v){
        this.v=v;
    }
        ArrayList<Integer> arraylist1 = new ArrayList<>();
	private static final int NO_PARENT = -1; 
        int count;
	// Function that implements Dijkstra's 
	// single source shortest path 
	// algorithm for a graph represented 
	// using adjacency matrix 
	// representation 
	public  void dijkstra(int[][] adjacencyMatrix, int startVertex,int endVertex) 
	{ 
		int nVertices = adjacencyMatrix[0].length; 

		// shortestDistances[i] will hold the 
		// shortest distance from src to i 
		int[] shortestDistances = new int[v]; 

		// added[i] will true if vertex i is 
		// included / in shortest path tree 
		// or shortest distance from src to 
		// i is finalized 
		boolean[] added = new boolean[v]; 

		// Initialize all distances as 
		// INFINITE and added[] as false 
		for (int vertexIndex = 0; vertexIndex < v;vertexIndex++) 
		{ 
			shortestDistances[vertexIndex] = Integer.MAX_VALUE; 
			added[vertexIndex] = false; 
		} 
		
		// Distance of source vertex from 
		// itself is always 0 
		shortestDistances[startVertex] = 0; 

		// Parent array to store shortest 
		// path tree 
		int[] parents = new int[v]; 

		// The starting vertex does not 
		// have a parent 
		parents[startVertex] = NO_PARENT; 

		// Find shortest path for all 
		// vertices 
		for (int i = 1; i < v; i++) 
		{ 

			// Pick the minimum distance vertex 
			// from the set of vertices not yet 
			// processed. nearestVertex is 
			// always equal to startNode in 
			// first iteration. 
			int nearestVertex = -1; 
			int shortestDistance = Integer.MAX_VALUE; 
			for (int vertexIndex = 0; vertexIndex < v; vertexIndex++) 
			{ 
				if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) 
				{ 
					nearestVertex = vertexIndex; 
					shortestDistance = shortestDistances[vertexIndex]; 
				} 
			} 

			// Mark the picked vertex as 
			// processed 
			added[nearestVertex] = true; 

			// Update dist value of the 
			// adjacent vertices of the 
			// picked vertex. 
			for (int vertexIndex = 0; vertexIndex < v; vertexIndex++) 
			{ 
				int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex]; 
				
				if (edgeDistance > 0&& ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) 
				{ 
                                   
                                   
					parents[vertexIndex] = nearestVertex; 
					shortestDistances[vertexIndex] = shortestDistance +edgeDistance; 
				} 
			} 
		} 

		printSolution(startVertex, shortestDistances, parents,endVertex); 
	} 

	// A utility function to print 
	// the constructed distances 
	// array and shortest paths 
	public void printSolution(int startVertex,int[] distances, int[] parents,int endVertex) 
	{ 
		int nVertices = distances.length; 
		System.out.print("Vertex\t Distance\tPath"); 
		
		for (int vertexIndex = 0; vertexIndex < v; vertexIndex++) 
		{ 
			if (vertexIndex != startVertex && vertexIndex==endVertex) 
			{ 
				System.out.print("\n" + startVertex + " -> "); 
				System.out.print(vertexIndex + " \t\t "); 
				System.out.print(distances[vertexIndex] + "\t\t");
                               
				printPath(vertexIndex, parents); 
                                count=distances[vertexIndex];
                               
			} 
		} 
	} 

	// Function to print shortest path 
	// from source to currentVertex 
	// using parents array 
        
     
	public void printPath(int currentVertex,int[] parents) 
	{  
           
		
		// Base case : Source node has 
		// been processed 
            
           
		if (currentVertex == NO_PARENT) 
		{ 
			return; 
                        
		} 
		printPath(parents[currentVertex], parents); 
                     
		System.out.print(currentVertex + " ");
               arraylist1.add( currentVertex);

                               
                  
	} 

		// Driver Code 
	public static void main(String[] args) 
	{ 
            //test
		int[][] adjacencyMatrix = { { 0, 10,1, 0 }, 
                    						{ 0, 0, 0, 0}, 
									{ 0, 0, 0, 4}, 
									{ 0, 2,0, 0 }, 
								 }; 
                DijkstrasAlgorithm d=new DijkstrasAlgorithm(4);
		d.dijkstra(adjacencyMatrix,2,1); 

                Iterator <Integer> i=d.arraylist1.iterator();
                 while(i.hasNext()){
                     int x=i.next();
                     System.out.println(x);
                 }
	} 
} 

