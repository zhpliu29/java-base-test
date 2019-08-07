package a2simplefactory;
/**
 * 具体产品类-折线图
 */
public class LineChart implements Chart {

    public LineChart(){
        System.out.println("创建折线图");
    }

    public void display() {
        System.out.println("显示折线图");
    }
}
