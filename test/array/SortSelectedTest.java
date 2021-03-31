package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortBy5Numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortBy3Numbers() {
        int[] data = new int[] {13, 20, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 13, 20};
        Assert.assertArrayEquals(expected, result);
    }
}