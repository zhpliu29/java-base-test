package a11adapter.b1;

import a11adapter.BinarySearch;
import a11adapter.QuickSort;
import a11adapter.ScoreOperation;

/**
 * 适配器类，使用组合的方式：对象适配器模式
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter(QuickSort quickSort, BinarySearch binarySearch){
        this.quickSort=quickSort;
        this.binarySearch=binarySearch;
    }

    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
