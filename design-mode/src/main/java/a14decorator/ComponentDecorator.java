package a14decorator;

/**
 * 抽象装饰类
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component){
        this.component=component;
    }

    @Override
    void display() {
        component.display();
    }
}
