package a2simplefactory;

/**
 * 具体产品类-柱状图
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("创建柱状图");
    }

    public void display() {
        System.out.println("显示柱状图");
    }
}
