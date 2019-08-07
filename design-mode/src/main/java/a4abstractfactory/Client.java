package a4abstractfactory;

public class Client {

    public static void main(String[] args) {
        //spring公司
        SkinFactory skinFactory=new SpringSkinFactory();
        Button button=skinFactory.createButton();
        TextField textField=skinFactory.createTextField();
        ComboBox comboBox=skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
        //summer公司
        SkinFactory skinFactory1=new SummerSkinFactory();
        Button button1=skinFactory1.createButton();
        TextField textField1=skinFactory1.createTextField();
        ComboBox comboBox1=skinFactory1.createComboBox();
        button1.display();
        textField1.display();
        comboBox1.display();
    }
}
