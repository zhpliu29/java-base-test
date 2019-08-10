package a11adapter.b2;

import a11adapter.BinarySearch;
import a11adapter.ScoreOperation;

/**
 * 适配器类，使用继承的方式：类适配器模式
 */
public class OperationAdapter3 extends BinarySearch implements ScoreOperation {

    public OperationAdapter3(){

    }

    public int[] sort(int[] array) {
        System.out.println("不支持该方法");
        return null;
    }

    public int search(int[] array, int key) {
       return this.binarySearch(array,key);
    }
}
