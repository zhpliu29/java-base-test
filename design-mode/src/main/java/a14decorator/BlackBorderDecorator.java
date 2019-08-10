package a14decorator;

/**
 * 具体装饰类：黑色边框装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorder(){
        System.out.println("为构件添加黑色边框");
    }

    @Override
    void display() {
        this.setBlackBorder();
        super.display();
    }
}
