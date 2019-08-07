package a4abstractfactory;

/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
