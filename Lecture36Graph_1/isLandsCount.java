package Lecture36Graph_1;

import java.util.Scanner;

public class isLandsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num of vertex :");
        int vertex = sc.nextInt();
        int[][] graph = new int[vertex][vertex];

        System.out.println("Enter Num of edges :");
        int edges = sc.nextInt();

        System.out.println("Enter All edges :");
        for (int i = 0; i < edges; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }// end for

        int numOfIslands = countIslands(graph);
        System.out.println("Number of Islands : "+ numOfIslands);
    }// end main

    private static int countIslands(int[][] graph) {
        int count = 0;
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false){
                dfs(graph, visited,i);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int[][] graph, boolean[] visited, int curr) {
        visited[curr] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[curr][j] == 1 && visited[j] == false){
                dfs(graph,visited,j);
            }
        }
    }
}// end class
