public class SelectionSort {
    private int temp;

    public SelectionSort() {
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                	
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 

                }
            }
        }
        return arr;
    }
}
