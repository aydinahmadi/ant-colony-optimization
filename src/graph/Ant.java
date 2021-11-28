package graph;
import java.security.SecureRandom;
import java.util.Random;

public class Ant {

    int cityCount;
    int startCity;
    int location;
    int chosenVertex;
    int traveledDistance = 0;
    double emittedPhermone;
    int [] antPath;
    boolean[] visited;
    Salesman salesman;

    Ant(int cityCount, Salesman salesman, int startCity) {
        this.cityCount = cityCount;
        this.salesman = salesman;
        this.startCity = startCity;
        this.visited = new boolean[cityCount+1];
        this.antPath = new int[cityCount+3];
        this.location = startCity;
    }

    void travel() {

        visited[0] = true;
        visited[1] = true;
        antPath[0] = 1;
        antPath[1] = startCity;

        while (condition()) {
            chooseRandom(salesman.calculateProbabilities(location, visited), visited);
            updateStatus(chosenVertex);
        }
            chosenVertex = startCity;
            updateStatus(chosenVertex);
            emittedPhermone = 1/(double)traveledDistance;
    }

    void chooseRandom(double[] probablity, boolean[] visited) {

        Random random = new SecureRandom();
        double selected = random.nextDouble();
        int i = 0;
        while (selected > probablity[i])
            i++;
        setChosenVertex(i);
    }

    boolean condition() {

        for (int i = 0; i <= cityCount; i++) {
            if (!visited[i])
                return true;
        }
        return false;
    }

    void updateStatus(int vertex) {

        antPath[++antPath[0]] = vertex;
        traveledDistance += salesman.graph.adjacencyMatrix[location][vertex];
        location = vertex;
        visited[location] = true;
    }


//    --------GETTERS & SETTERS
    public int getCityCount() {
        return cityCount;
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getChosenVertex() {
        return chosenVertex;
    }

    public void setChosenVertex(int chosenVertex) {
        this.chosenVertex = chosenVertex;
    }

    public double getEmittedPhermone() {
        return emittedPhermone;
    }

    public void setEmittedPhermone(double emittedPhermone) {
        this.emittedPhermone = emittedPhermone;
    }

    public int[] getAntPath() {
        return antPath;
    }

    public void setantPath(int[] antPath) {
        this.antPath = antPath;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }
}

