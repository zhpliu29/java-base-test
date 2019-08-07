package a2simplefactory;

/**
 * 静态工厂
 */
public class ChartFactory {

    public static Chart getChart(String type){
        Chart chart=null;
        if (type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            //初始化柱状图
            System.out.println("初始化柱状图");
        }else if (type.equalsIgnoreCase("pie")){
            chart=new PieChart();
            //初始化饼状图
            System.out.println("初始化饼状图");
        }else if (type.equalsIgnoreCase("line")){
            chart=new LineChart();
            //初始化折线图
            System.out.println("初始化折线图");
        }
        return chart;
    }
}
