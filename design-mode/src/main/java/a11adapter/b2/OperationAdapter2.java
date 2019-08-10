package a11adapter.b2;

import a11adapter.QuickSort;
import a11adapter.ScoreOperation;

/**
 * 适配器类，使用继承的方式：类适配器模式
 */
public class OperationAdapter2 extends QuickSort implements ScoreOperation {

    public OperationAdapter2(){

    }

    public int[] sort(int[] array) {
        return this.quickSort(array);
    }

    public int search(int[] array, int key) {
        System.out.println("不支持该方法");
        return -1;
    }
}
