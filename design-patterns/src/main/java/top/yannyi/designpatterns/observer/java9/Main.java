package top.yannyi.designpatterns.observer.java9;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: LeahAna
 * @Date: 2023/6/7 15:49
 * @Desc:
 */

// 被观察者
class Subject extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged(); // 标记状态已改变
        notifyObservers(); // 通知所有观察者
    }
}
// 观察者
class ConcreteObserver implements Observer {

    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            System.out.println(observerName + " received data: " + subject.getData());
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setData("New Data");
    }
}
