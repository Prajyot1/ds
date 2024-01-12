package Lecture36Graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {
    // bfs
    public static boolean hasPath2(int[][] matrix , int curr , int end , boolean[] visit){
        Queue<Integer> queue = new LinkedList<>();
        visit[curr] = true;
        queue.add(curr);

        if (matrix[curr][end] == 1) return true;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();


            for (int i = 0; i < matrix.length; i++) {
                if (matrix[currVertex][i] == 1 && visit[i] == false){
                    if (i == end) return true;
                    else{
                        visit[i] = true;
                        queue.add(i);
                    }
                }
            }
        }
    return false;
    }

    // dfs
    public static boolean hasPath(int[][] matrix , int curr , int end ,boolean[] visit){
        if(curr == end) return true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[curr][i] == 1 && visit[i] == false){
                visit[i] = true;
                return hasPath(matrix , i , end , visit);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num of vertices  :");
        int vertices = sc.nextInt();

        int[][] mat = new int[vertices][vertices];

        System.out.println("Enter Num of edges  :");
        int edges = sc.nextInt();

        System.out.println("Enter The Edges between vertices :");
        for (int i = 0; i < edges; i++) {
            int  v1 = sc.nextInt();
            int v2 = sc.nextInt();
            mat[v1][v2] = 1;
            mat[v2][v1] = 1;
        }
        System.out.println("Enter starting and ending vertex");
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean[] visited = new boolean[mat.length];
        visited[start] = true;

//        boolean ans = hasPath(mat , start , end , visited);
//        System.out.println(ans);
        boolean ans = hasPath2(mat , start , end , visited);
        System.out.println(ans);
    }// end main
}
//4 4 0 1 0 3 1 2 2 3 1 3