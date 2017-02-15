package classic_algorithms.bubble_sort;

/**
 * Created by bijan on 2/15/17.
 */
public class BubbleSorter {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 3, 5, 7, 6, 8};
        bubbleSort(array);
        for (int i : array) System.out.println(i);
    }
}
