package top.yannyi.designpatterns.adapter;

/**
 * @Author: LeahAna
 * @Date: 2023/6/21 10:46
 * @Desc: 目标接口
 */
// 目标接口
interface Target {
    void request();
}

// 需要适配的类
class Adaptee {
    void specificRequest() {
        System.out.println("Adaptee's specificRequest");
    }
}

// 适配器
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// 客户端
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
