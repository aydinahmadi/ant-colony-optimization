/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TspDynamicProgrammingIterative {

  private final int N, start;
  private final double[][] distance;
  private List<Integer> tour = new ArrayList<>();
  private double minTourCost = Double.POSITIVE_INFINITY;
  private boolean ranSolver = false;

  public TspDynamicProgrammingIterative(double[][] distance) {
    this(0, distance);
  } 

  public TspDynamicProgrammingIterative(int start, double[][] distance) {
    N = distance.length;

    if (N <= 2) throw new IllegalStateException("N <= 2 not yet supported.");
    if (N != distance[0].length) throw new IllegalStateException("Matrix must be square (n x n)");
    if (start < 0 || start >= N) throw new IllegalArgumentException("Invalid start node.");

    this.start = start;
    this.distance = distance;
  }

  // Returns the optimal tour for the traveling salesman problem.
  public List<Integer> getTour() {
    if (!ranSolver) solve();
    return tour;
  }

  // Returns the minimal tour cost.
  public double getTourCost() {
    if (!ranSolver) solve();
    return minTourCost;
  }

  // Solves the traveling salesman problem and caches solution.
  public void solve() {

    if (ranSolver) return;

    final int END_STATE = (1 << N) - 1;//همه راس ها ویزیت شده اند بیت ها مساوی۱ 
    Double[][] memo = new Double[N][1 << N];

    // Add all outgoing edges from the starting node to memo table.
    //فاصله بین تمامی راسها از راس مبدا را در  ممو تیبل میذاریم
    for (int end = 0; end < N; end++) {
      if (end == start) continue;
      memo[end][(1 << start) | (1 << end)] = distance[start][end];
    }

    for (int r = 3; r <= N; r++) {
      for (int subset : combinations(r, N)) {
        if (notIn(start, subset)) continue;
        for (int next = 0; next < N; next++) //گره بعدی به عنوان هدف که میخوایمبسطش بدیم
        {
          if (next == start || notIn(next, subset)) continue;
          int subsetWithoutNext = subset ^ (1 << next);//تور کامل بدون گره بعدی به عبارتی حذف میکنیم از ترکیبات 
         //اجازه میدهد که بعدا به ممو تیبل مراحعه کنیم و فاصله جدید را محاسبه کنیم
          double minDist = Double.POSITIVE_INFINITY;
          for (int end = 0; end < N; end++) {
            if (end == start || end == next || notIn(end, subset)) continue;
            double newDistance = memo[end][subsetWithoutNext] + distance[end][next];
            if (newDistance < minDist) {
              minDist = newDistance;
            }
          }
          memo[next][subset] = minDist;
        }
      }
    }

    // Connect tour back to starting node and minimize cost.
    //کمترین طول را پیدا میکند
    for (int i = 0; i < N; i++) {
      if (i == start) continue;
      //تور در  آي اگه تا ته بره و خاتمه پیدا کنه یه بارم از آی به نود اول میریم
      double tourCost = memo[i][END_STATE] + distance[i][start];
      if (tourCost < minTourCost) {
        minTourCost = tourCost;
      }
    }

    int lastIndex = start;
    int state = END_STATE;
    tour.add(start);

    // Reconstruct TSP path from memo table.
    //آرایه تور را پیدا میکند
    for (int i = 1; i < N; i++) {

      int index = -1;//نودی که ما دفه بعد میخوایم بهش بریم next best node
      for (int j = 0; j < N; j++) {
        if (j == start || notIn(j, state)) continue;//ج در استیت نباشد اسکپ کن
        if (index == -1) index = j;
        //اگه این نود ج به ما مقدار کمتری بدهد نود بعدی همین ج میشود
        double prevDist = memo[index][state] + distance[index][lastIndex];
        double newDist  = memo[j][state] + distance[j][lastIndex];
        if (newDist < prevDist) {
          index = j;
        }
      }

      tour.add(index);
      state = state ^ (1 << index);
      lastIndex = index;
    }

    tour.add(start);
    Collections.reverse(tour);

    ranSolver = true;
  }

  private static boolean notIn(int elem, int subset) {
    return ((1 << elem) & subset) == 0;
  }

  //تمام ترکیبات رفتن بین دو راس را حساب میکند
  // This method generates all bit sets of size n where r bits 
  // are set to one. The result is returned as a list of integer masks.
  public static List<Integer> combinations(int r, int n) {
    List<Integer> subsets = new ArrayList<>();
    combinations(0, 0, r, n, subsets);
    return subsets;
  }

  // To find all the combinations of size r we need to recurse until we have
  // selected r elements (aka r = 0), otherwise if r != 0 then we still need to select
  // an element which is found after the position of our last selected element
  private static void combinations(int set, int at, int r, int n, List<Integer> subsets) {

    // Return early if there are more elements left to select than what is available.
    int elementsLeftToPick = n - at;
    if (elementsLeftToPick < r) return;

    // We selected 'r' elements so we found a valid subset!
    if (r == 0) {
      subsets.add(set);
    } else {
      for (int i = at; i < n; i++) {
        // Try including this element
        set |= 1 << i;

        combinations(set, i + 1, r - 1, n, subsets);

        // Backtrack and try the instance where we did not include this element
        set &= ~(1 << i);
      }
    }
  }

  public static void main(String[] args) {
    // Create adjacency matrix
    int n = 3;
    double[][] distanceMatrix = new double[n][n];
    for (double[] row : distanceMatrix) java.util.Arrays.fill(row, 10000);

  distanceMatrix[0][1]=6;
  distanceMatrix[1][2]=4;
  distanceMatrix[2][0]=1;
   TspDynamicProgrammingIterative solver = new TspDynamicProgrammingIterative(0, distanceMatrix);
   System.out.println("Tour: " + solver.getTour());
   System.out.println("Tour cost: " + solver.getTourCost());

  }
  
}




