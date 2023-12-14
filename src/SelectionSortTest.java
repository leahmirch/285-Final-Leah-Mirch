import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testPositive() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 3, 1, 4, 2};
        selectionSort.selectionSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNegatives() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {-5, -3, -1, -4, -2};
        selectionSort.selectionSort(arr);
        int[] expected = {-5, -4, -3, -2, -1};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixed() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {-5, 3, 0, -4, 2};
        selectionSort.selectionSort(arr);
        int[] expected = {-5, -4, 0, 2, 3};
        assertArrayEquals(expected, arr);
    }
}
