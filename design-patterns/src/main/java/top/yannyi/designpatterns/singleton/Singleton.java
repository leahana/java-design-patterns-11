package top.yannyi.designpatterns.singleton;

/**
 * @Author: LeahAna
 * @Date: 2023/6/21 10:37
 * @Desc: 单例模式示例
 */

public class Singleton {

    // 在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static final Singleton INSTANCE = new Singleton();

    // 私有化构造函数，防止其他类创建实例
    private Singleton() {}

    // 提供全局访问点
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 添加一个示例方法
    public void showMessage(){
        System.out.println("Hello Singleton");
    }

}
