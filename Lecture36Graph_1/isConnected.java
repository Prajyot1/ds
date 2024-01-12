package Lecture36Graph_1;

import java.util.Scanner;

public class isConnected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of vertex :");
        int vertex = sc.nextInt();

        System.out.println("Enter num of edges :");
        int vertices = sc.nextInt();

        System.out.println("Enter all edges :");
        int[][] graph = new int[vertex][vertex];
        for (int i = 0; i < vertices; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }// end for

        boolean ans = checkIfConnected(graph);
        if (ans) System.out.println("The Graph is connected :");
        else System.out.println("The Graph is dis Connected :");

    }// end main

    private static boolean checkIfConnected(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        visited[0] = true;
        traverseGraph(graph , visited , 0);

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) return false;
        }
        return true;
    }

    private static void traverseGraph(int[][] graph, boolean[] visited, int curr) {
        // dfs
        for (int i = 0; i < graph.length; i++) {
            if (graph[curr][i] == 1 && visited[i] == false){
                visited[i] = true;
                traverseGraph(graph , visited , i);
            }
        }
    }
}// end class
