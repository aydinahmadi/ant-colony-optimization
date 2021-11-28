
package graph;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Graph 
{
       int vertex;
    LinkedList<Integer> list[];
      int[] arr;
      int[] arr1;

    public Graph(int vertex) {
    
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            list[i] = new LinkedList<>();
           
        }
            this.arr = new int[this.vertex];
            this.arr1= new int [this.vertex];
    }
  
    
    public void clear(){
        
        for(int i=0;i<vertex;i++){
            list[i].clear();
        }
    }
     public  void addEdge(int source, int destination){

        //add edge
        list[source].addFirst(destination);

        //add back edge ((for undirected)
        list[destination].addFirst(source);
    }

     public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
     }

  
      void DFS(int s) 
        { 
          
              int j=0;
            // Initially mark all vertices as not visited 
            Vector<Boolean> visited = new Vector<>(vertex); 
            for (int i = 0; i < vertex; i++) 
                visited.add(false); 
      
            // Create a stack for DFS 
            Stack<Integer> stack = new Stack<>(); 
              
            // Push the current source node 
            stack.push(s); 
              
            while(stack.empty() == false) 
            { 
                // Pop a vertex from stack and print it 
                s = stack.peek(); 
                stack.pop(); 
                  
                // Stack may contain same vertex twice. So 
                // we need to print the popped item only 
                // if it is not visited. 
                if(visited.get(s) == false) 
                { 
                    System.out.print(s + " "); 
                    arr[j]=s;
                    visited.set(s, true);
                    j++;
                } 
                  
                // Get all adjacent vertices of the popped vertex s 
                // If a adjacent has not been visited, then puah it 
                // to the stack. 
                Iterator<Integer> itr = list[s].iterator(); 
                  
                while (itr.hasNext())  
                { 
                    int v = itr.next(); 
                    if(!visited.get(v)) 
                        stack.push(v); 
                } 
                  
            } }
      
     
      public void BFS(int s) 
    { 
        
        // Mark all the vertices as not visited(By default 
        // set as false) 
        boolean visited[] = new boolean[vertex]; 
  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
     
        int j=0;
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
              arr1[j]=s;
               
            // Get all adjacent vertices of the dequeued vertex s 
           // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = list[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
             
                    queue.add(n); 
                } 
            } 
              j++;
        } 
    } 
      
      
  
      
}

