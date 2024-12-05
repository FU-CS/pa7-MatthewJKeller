package pa7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q2Test {

    @Test
    public void testIslands() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(1, result);
    }

    @Test
    public void testIslandsSingleIsland() {
        char[][] grid = {
            {'1', '1', '1'},
            {'1', '1', '1'},
            {'1', '1', '1'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(1, result);
    }

    @Test
    public void testIslandsNoIsland() {
        char[][] grid = {
            {'0', '0', '0'},
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(0, result);
    }

    @Test
    public void testIslandsMultipleIslands() {
        char[][] grid = {
            {'1', '0', '0', '1'},
            {'1', '1', '0', '0'},
            {'0', '1', '1', '1'},
            {'0', '0', '0', '1'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(2, result);
    }

    @Test
    public void testIslandsEmpty() {
        char[][] grid = new char[0][0]; 
        int result = new Q2().numberOfIslands(grid);
        assertEquals(0, result);
    }

    @Test
    public void testIslandsRow() {
        char[][] grid = {
            {'1', '1', '0', '1', '0'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(2, result);
    }

    @Test
    public void testIslandsColumn() {
        char[][] grid = {
            {'1'},
            {'1'},
            {'0'},
            {'1'}
        };
        int result = new Q2().numberOfIslands(grid);
        assertEquals(2, result);
    }

}