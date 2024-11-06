package pa7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class Q1Test {
    @Test
    public void testRotateImage1x1() {
        int[][] matrix = {
            {1}
        };
        int[][] expected = {
            {1}
        };
        new Q1().rotateImage(matrix);
        assertArrayEquals(expected, matrix);
    }
    @Test
    public void testRotateImage2x2() {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        int[][] expected = {
            {3, 1},
            {4, 2}
        };
        new Q1().rotateImage(matrix);
        assertArrayEquals(expected, matrix);
    }
    @Test
    public void testRotateImage3x3() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };
        new Q1().rotateImage(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotateImage4x4() {
        int[][] matrix = {
            { 5,  1,  9, 11},
            { 2,  4,  8, 10},
            {13,  3,  6,  7},
            {15, 14, 12, 16}
        };
        int[][] expected = {
            {15, 13,  2,  5},
            {14,  3,  4,  1},
            {12,  6,  8,  9},
            {16,  7, 10, 11}
        };
        new Q1().rotateImage(matrix);
        assertArrayEquals(expected, matrix);
    }
}