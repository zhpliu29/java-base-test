package a14decorator;

/**
 * 具体装饰类：滚动条装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void setScrollBar(){
        System.out.println("为构件添加滚动条");
    }

    @Override
    void display() {
        this.setScrollBar();
        super.display();
    }
}
