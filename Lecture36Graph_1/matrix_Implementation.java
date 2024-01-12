package Lecture36Graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class matrix_Implementation {
    public static Scanner sc = new Scanner((System.in));
    public static void DfsHelp(int[][] matrix){
        // to create a visited boolean array
        // and call dfs
        boolean[] visit = new boolean[matrix.length];
        System.out.println("Enter The first Vertex ");
        int v = sc.nextInt();  // starting  vertex

        DFStraversl(matrix,visit,v);
    }
    public static void DFStraversl(int[][] matrix , boolean visited[], int currV){
        // base
        visited[currV] = true;
        System.out.print(currV + " ");
        for (int i = 0; i < matrix.length;i++){
             if(matrix[currV][i] == 1 && visited[i] == false){
                DFStraversl(matrix, visited , i);
            }
        }
    }
    // breath first traversal

    public static void breathFirstSearchHelp(int[][] matrix){
        boolean[] visited = new boolean[matrix.length];

        breathFirstSearch(matrix , visited);
    }

    public static void breathFirstSearch(int[][] matrix , boolean[] visited ){

        System.out.println("Enter starting vertex : ");
        int start = sc.nextInt();
        visited[start] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr + " ");

            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[curr][i] == 1 && visited[i] == false){
                    visited[i] = true;
                    queue.add(i);
                }
            }// end for
        }// end while
    }// end function
    public static void printMatrixGraph(int[][] graph){
        // for printing row table
        System.out.print("  ");
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num of Vertices ");
        int n = sc.nextInt();  // numbers of verties
        // 0 based vertices
        System.out.println("Enter num of Edges ");
        int m = sc.nextInt();   // number of edges

        int[][] mat = new int[n][n];
        System.out.println("Enter the Edges between vertices ");
        for (int i = 1; i <= m; i++) {
            int v = sc.nextInt();   // vertex 1 of edge
            int v1 = sc.nextInt(); // vertex 2 of edge
            mat[v][v1] = 1;
            mat[v1][v] = 1;
        }
        // print graph
        //printMatrixGraph(mat);

        //depth first traversal
        //DfsHelp(mat);
        //breath first traversal
        //breathFirstSearchHelp(mat);

        // not connected graph
    //    dfsUnconectedHelp(mat);
        bfsUnconnectedHelp(mat);
        // 5 4 0 1 0 2 0 3 1 4 0
        // 9 11 0 1 0 2 0 3 1 4 2 6 3 7 3 6 2 5 4 5 6 7 6 8


        // 5 5  0 1 1 2 1 3 2 3  3 4
        // 4 5 0 1 0 2 0 3 1 3 2 3
        //  3 4 0 1 0 3 1 2 0
        //3 3 0 1 0 2 1 2 0


    }

    private static void bfsUnconnectedHelp(int[][] mat) {
        System.out.println("Enter Starting vertes :");
        boolean[] visited = new boolean[mat.length];


        for (int i = 0; i < mat.length; i++) {
            bfsUnconnected(mat , i , visited);
        }
    }

    private static void bfsUnconnected(int[][] mat, int start, boolean[] visit) {
        System.out.print(start + " ");
        visit[start] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            for (int i = 0; i < mat.length; i++) {
                if (mat[curr][i] == 1 && visit[i] == false){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void dfsUnconectedHelp(int[][] mat) {
        boolean[] visit = new boolean[mat.length];
        System.out.println("Enter starting vertex : ");

        for (int i = 0; i < visit.length; i++) {
            if (visit[i] == false) dfsUnconected(mat,visit,i);
            System.out.println();
        }
    }

    private static void dfsUnconected(int[][] mat, boolean[] visited , int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < mat.length; i++) {
            if (mat[curr][i] == 1 && visited[i] == false){
                visited[i] = true;
                dfsUnconected(mat,visited,i);
            }
        }

    }

}
