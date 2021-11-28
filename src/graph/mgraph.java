/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

public class mgraph{
    int v;
    double array[][];
    public mgraph(int v){
        this.v=v;
        double arr[][]=new double [v][v];
        this.array=arr;
    }
    
    
    public void addege(int source,int destination,int weight){
        array[source][destination]=weight;
    }

     public void printGraph() {
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(array[i][j]!=0){
                    System.out.println("vertex " + i + "is connect to " + j + "with " + array[i][j] + "weight");
                }
            }
        }
    }
     
     
     
}