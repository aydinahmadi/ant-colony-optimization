/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Salesman {

//    --------PROPERTIES
    int cityCount;
    int startCity=1;
    int maxTravaledDistance = 0;
    int[] maxTraveled;
    int antCount;
    double vaporize = 0.5;
    double phermoneLvlBuffer;
    double[][] phermoneLvl;
    Graphh graph;
    double alpha=1;
    double beta=1;
//    --------CONSTRUCTOR

    public Salesman(int cityCount, int antCount, Graphh graph) {
        this.cityCount = cityCount;
        this.antCount = antCount;
        this.graph = graph;
        phermoneLvl = new double[cityCount+1][cityCount+1];
        for (int i = 0; i < cityCount+1; i++) {
            Arrays.fill(phermoneLvl[i], 1);
            phermoneLvl[i][i] = 0;
        }

    }


//    --------FUNCTIONS

    void startAlgorithm() {

        int iterator = 1;
        while (condition(iterator)) {
            int[] path;
            Ant ant = new Ant(cityCount, this, startCity);
            ant.travel();
            phermoneLvlBuffer = ant.getEmittedPhermone();
            path = ant.getAntPath();
            updatePhermoneLvl(phermoneLvlBuffer, path);
            iterator++;
        } //lets the ants travel the graph
        maxTraveled = findMaxTraveled(); //finds the most used path and sets it to property
    }


    int[] findMaxTraveled() {

        int[] output = new int[cityCount+1];
        output[0] = startCity;
        int currentCity = startCity;
        int nextCity;
        int i=1;
        while(i <= cityCount) {

            nextCity = findMax(phermoneLvl[currentCity]);
            maxTravaledDistance += graph.adjacencyMatrix[currentCity][nextCity];
            output[i] = nextCity;
            currentCity = nextCity;
            i++;
        }
        return output;
    }

    private int findMax(double[] input) {

        int maxIndex = 1;
        for (int i = 1; i <= cityCount; i++) {

            if (input[i] > input[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    double[] calculateProbabilities(int vertex, boolean[] visited) {

        double denum = 0;
        double[] output = new double[cityCount+1];
        output[0] = 0;
        for (int i = 1; i < cityCount+1; i++) {

            if (i == vertex || visited[i])
                output[i] = output[i-1];
            else {
                double tmp =Math.pow(phermoneLvl[vertex][i], alpha) /Math.pow(graph.adjacencyMatrix[vertex][i], beta);
               
                output[i] = output[i-1] + tmp;
                denum += tmp;
            }
        }

        for (int i = 1; i < cityCount+1; i++) {
            output[i] /= denum;
        }

            return output;
    }

    void updatePhermoneLvl(double phermoneLvlChange, int[] path) {

        for (int i = 0; i <= cityCount; i++) {
            for (int j = 0; j <= cityCount; j++) {
                phermoneLvl[i][j] *= vaporize;
            }
        }

        for (int i = 1; i <= path[0] ; i++) {

            phermoneLvl[path[i]][path[i+1]] += phermoneLvlChange;
        }
    }

    boolean condition(int iterator) {

        return iterator <= antCount;
    }


//    --------GETTERS & SETTERS

    public int getCityCount() {
        return cityCount;
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }

    public double getPhermoneLvlBuffer() {
        return phermoneLvlBuffer;
    }

    public void setPhermoneLvlBuffer(double phermoneLvlBuffer) {
        this.phermoneLvlBuffer = phermoneLvlBuffer;
    }

    public double[][] getPhermoneLvl() {
        return phermoneLvl;
    }

    public void setPhermoneLvl(double[][] phermoneLvl) {
        this.phermoneLvl = phermoneLvl;
    }

    public int getMaxTravaledDistance() {
        return maxTravaledDistance;
    }

    public void setMaxTravaledDistance(int maxTravaledDistance) {
        this.maxTravaledDistance = maxTravaledDistance;
    }

    public int[] getMaxTraveled() {
        return maxTraveled;
    }

    public void setMaxTraveled(int[] maxTraveled) {
        this.maxTraveled = maxTraveled;
    }
}
