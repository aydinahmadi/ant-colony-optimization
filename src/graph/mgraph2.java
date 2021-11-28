/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

/**
 *
 * @author ASUS
 */
public class mgraph2 {
      int v;
    int array[][];
    public mgraph2(int v){
        this.v=v;
        int arr[][]=new int [v][v];
        this.array=arr;
    }
    
     public void clear(){
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++)
            array[i][j]=0;
        }
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
