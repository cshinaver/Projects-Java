package classic_algorithms.merge_sort;

import java.util.Arrays;

/**
 * Created by bijan on 2/15/17.
 */
public class MergeSorter {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int totalSize = array1.length + array2.length;
        int[] newArray = new int[totalSize];
        int i = 0, j = 0;
        for (int s = 0; s < totalSize; s++ ) {
            if (j >= array2.length ||  i < array1.length && array1[i] <= array2[j]) {
                newArray[s] = array1[i];
                i++;
            } else {
                newArray[s] = array2[j];
                j++;
            }
        }
        return newArray;
    }
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int half = array.length / 2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, half));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, half, array.length));
        return mergeArrays(leftArray, rightArray);
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 3, 6, 5, 8, 7};
        array = mergeSort(array);
        for (int i : array) System.out.println(i);
    }
}
