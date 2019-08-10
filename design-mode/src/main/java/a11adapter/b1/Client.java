package a11adapter.b1;

import a11adapter.BinarySearch;
import a11adapter.QuickSort;
import a11adapter.ScoreOperation;

public class Client {

    public static void main(String[] args) {

        int[] array={1,2,3,4,5,7,6};
        int key=3;

        QuickSort quickSort=new QuickSort();
        BinarySearch binarySearch=new BinarySearch();
        ScoreOperation scoreOperation=new OperationAdapter(quickSort,binarySearch);

        int[] result=scoreOperation.sort(array);
        int value=scoreOperation.search(result,key);
        System.out.println("排序结果："+result);
        System.out.println("查找结果："+value);

    }
}
