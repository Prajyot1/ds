package Lecture36Graph_1;

import java.util.*;

public class getPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of vertex : ");
        int vertex = sc.nextInt();

        System.out.println("Enter num of edges : ");
        int edges = sc.nextInt();

        int[][] matrix = new int[vertex][vertex];

        System.out.println("Enter all edges :");
        for (int i = 0; i < edges; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
        }
        System.out.println("Enter starting vertex : ");
        int start = sc.nextInt();

        System.out.println("Enter ending vertex : ");
        int end = sc.nextInt();

        boolean[] visit = new boolean[matrix.length];
//        ArrayList<Integer> list = getPathBFS(matrix , start ,end , visit);


        ArrayList<Integer> list = getPathDFS(matrix , start ,end , visit);
        // 7 7 0 1 0 3 1 2 3 2 3 4 2 5 5 6 0 4
        System.out.println(list);

        // 6 5 0 1 0 2 0 3 1 4 2 5
        // 7 8 0 1 0 2 1 4 2 3 3 4 4 6 3 5 6 5 0 5
    }

    private static ArrayList<Integer> getPathDFS(int[][] matrix, int curr, int end, boolean[] visit) {
        if (curr == end) return new ArrayList<>(Arrays.asList(curr));

        visit[curr] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[curr][i] == 1 && visit[i] == false){
                ArrayList<Integer> smAns = getPathDFS(matrix , i , end , visit);
                if (smAns != null){
                    smAns.add(curr);
                    return smAns;
                }
            }
        }
        return null;
    }

    private static ArrayList<Integer> getPathBFS(int[][] matrix , int st , int ed , boolean[] visited) {
        boolean foundPath = false;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,-1);

        Queue<Integer> pendingQueue = new LinkedList<>();
        visited[st] = true;
        pendingQueue.add(st);

        while (!pendingQueue.isEmpty()){
            int currVertex = pendingQueue.poll();

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[currVertex][i] == 1 && visited[i] == false){
                    map.put(i , currVertex);
                    visited[i] = true;
                    pendingQueue.add(i);
                    if (i == ed) {
                        foundPath = true;
                        break;
                    }
                } // end if
            }// end for

        }//  end while
    if (foundPath){
        ArrayList<Integer> list = new ArrayList<>();
        int curr = ed;

        while (curr != -1){

            list.add(curr);
            int parent = map.get(curr);
            curr = parent;
        }
        return list;
    }

    return null;
    }// end function


}
