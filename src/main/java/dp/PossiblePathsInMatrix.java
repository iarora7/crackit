package main.java.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

/*
 * Reach (X,Y) from (0,0) in a matrix. path gives the path of maze elements traversed to reach x,y.
 */
public class PossiblePathsInMatrix {

	private static Map<Point, Boolean> cache = new HashMap<Point, Boolean>();
	private static List<Point> path = new ArrayList<Point>();

	public static void main(String args[]) {
		int x = 3, y = 3;
		int[][] maze = { { 1, 2, 3 }, { 2, 3, -4 }, { 3, 4, 5 } };
		boolean pathExists = getPath(maze, x - 1, y - 1, path, cache);
		System.out.println("Path size: " + path.size());
		Iterator<Point> itr = path.iterator();
		while (itr.hasNext()) {
			Point p = itr.next();
			System.out.println(p.x + ", " + p.y);
		}

	}

	private static boolean getPath(int[][] maze, int x, int y, List<Point> path, Map<Point, Boolean> cache) {
		if (x < 0 || y < 0 || maze[x][y] < 0) {
			return false;
		}

		Point p = new Point(x, y);
		boolean success = false;
		if (cache.containsKey(p)) {
			success = cache.get(p);
		}
		boolean isAtOrigin = (x == 0 && y == 0);

		if (isAtOrigin || getPath(maze, x - 1, y, path, cache) || getPath(maze, x, y - 1, path, cache)) {
			path.add(p);
			success = true;
		}

		cache.put(p, success);
		return success;
	}
}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
