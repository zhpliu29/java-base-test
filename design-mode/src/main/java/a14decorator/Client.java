package a14decorator;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        Component component=new Window();

        Component componentSB=new ScrollBarDecorator(component);
        componentSB.display();

        System.out.println("----------------");

        Component componentBB=new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
