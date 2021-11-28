/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

public class Graphh {

    //    --------PROPERTIES
    int cityCount;
    int[][] adjacencyMatrix;


    //    --------CONSTRUCTOR
    Graphh(int cityCount, int[][] adjacencyMatrix) {

        this.cityCount = cityCount;
        this.adjacencyMatrix = adjacencyMatrix;
    }
     Graphh(int cityCount){
         this.cityCount=cityCount;
         int adjacencyMatrix[][]=new int [cityCount][cityCount];
        this.adjacencyMatrix=adjacencyMatrix;
     }


    //    --------FUNCTIONS
    void setInput(int input[][]) {

        this.adjacencyMatrix = input;
    }

    int[] getAdjacentEdgeDistance(int vertex) {

        return new int[cityCount];
    }
    //add by zeynab
      void clear(){
        
        for(int i=0;i<cityCount;i++){
            for(int j=0;j<cityCount;j++)
            adjacencyMatrix[i][j]=0;
        }
    }
       public void addege(int source,int destination,int weight){
        adjacencyMatrix[source][destination]=weight;
        adjacencyMatrix[destination][source]=weight;
    }


//    --------GETTERS & SETTERS

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }
}

