package top.yannyi.designpatterns.abstractfactory;

// 接口形式定义产品族
interface Button {
    void display();
}

interface TextField {
    void display();
}

// Windows系列产品
class WindowsButton implements Button {
    public void display() {
        System.out.println("显示窗口风格的按钮。");
    }
}

class WindowsTextField implements TextField {
    public void display() {
        System.out.println("显示窗口风格的文本框。");
    }
}

// Mac系列产品
class MacButton implements Button {
    public void display() {
        System.out.println("显示Mac风格的按钮。");
    }
}

class MacTextField implements TextField {
    public void display() {
        System.out.println("显示Mac风格的文本框。");
    }
}

// 抽象工厂：提供创建产品族的接口
interface GUIFactory {
    Button createButton();
    TextField createTextField();
}

// Windows系列产品工厂
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public TextField createTextField() {
        return new WindowsTextField();
    }
}

// Mac系列产品工厂
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public TextField createTextField() {
        return new MacTextField();
    }
}
