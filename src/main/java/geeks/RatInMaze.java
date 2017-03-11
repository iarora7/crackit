package main.java.geeks;

/**
 * Created by arorai on 1/19/17.
 */
public class RatInMaze {

    private int N = 4;

    public static void main(String args[]) {
        RatInMaze ratInMaze = new RatInMaze();
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        System.out.println(ratInMaze.solveMaze(maze));
    }

    private boolean solveMaze(int[][] maze) {

        int[][] sol = {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        if(solveMaze(maze, 0, 0, sol)) {
            return true;
        }
        return false;
    }

    private boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {

        if(x==N-1 && y==N-1){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze,x,y)) {
            sol[x][y] = 1;

            if(solveMaze(maze,x+1,y,sol))
                return true;

            if(solveMaze(maze,x,y+1,sol))
                return true;

            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    private boolean isSafe(int[][] maze, int x, int y) {
        if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1) {
            return true;
        }
        return false;
    }
}
