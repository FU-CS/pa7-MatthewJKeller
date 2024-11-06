package pa7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q3Test {

    @Test
    public void testIslandsSingleIsland() {
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(9, result);
    }

    @Test
    public void testIslandsNoIsland() {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(0, result);
    }

    @Test
    public void testIslandsMultipleIslands() {
        int[][] grid = {
            {1, 0, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
        };
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(7, result);
    }

    @Test
    public void testIslandsEmpty() {
        int[][] grid = new int[0][0];  
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(0, result);
    }

    @Test
    public void testIslandsRow() {
        int[][] grid = {
            {1, 1, 0, 1, 0}
        };
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(2, result);
    }

    @Test
    public void testIslandsColumn() {
        int[][] grid = {
            {1},
            {1},
            {0},
            {1}
        };
        int result = Q3.maxAreaOfIsland(grid);
        assertEquals(2, result);
    }
}
