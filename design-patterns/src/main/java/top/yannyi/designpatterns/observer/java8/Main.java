package top.yannyi.designpatterns.observer.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: LeahAna
 * @Date: 2023/6/8 09:21
 * @Desc:
 */


public class Main {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();

        // 利用lambda表达式创建观察者
        Consumer<Observable> observer1 = (Observable o) -> {
            if (o instanceof ConcreteObservable) {
                System.out.println("Observer 1: " + ((ConcreteObservable) o).getData());
            }
        };

        Consumer<Observable> observer2 = (Observable o) -> {
            if (o instanceof ConcreteObservable) {
                System.out.println("Observer 2: " + ((ConcreteObservable) o).getData());
            }
        };

        observable.registerObservers(observer1);
        observable.registerObservers(observer2);
        observable.setData("New data");

    }

}

// 被观察者接口
interface Observable {
    void registerObservers(Consumer<Observable> observer);

    void notifyObservers();
}

// 观察者接口
interface Observer {
    void update(Observable observable);
}

// 被观察的类
class ConcreteObservable implements Observable {

    private List<Consumer<Observable>> observers = new ArrayList<>();
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public void registerObservers(Consumer<Observable> observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.accept(this));
    }
}
