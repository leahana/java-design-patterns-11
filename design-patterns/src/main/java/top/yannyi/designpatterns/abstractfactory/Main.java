package top.yannyi.designpatterns.abstractfactory;

// 定义产品接口
interface Animal {
    void eat();
}

// 具体产品类
class Lion implements Animal {
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}

class Deer implements Animal {
    public void eat() {
        System.out.println("Deer eats grass.");
    }
}

// 定义抽象工厂
interface ZooFactory {
    Animal createAnimal();
}

// 具体工厂类
class CarnivorousAnimalZooFactory implements ZooFactory {
    public Animal createAnimal() {
        return new Lion();
    }
}

class HerbivorousAnimalZooFactory implements ZooFactory {
    public Animal createAnimal() {
        return new Deer();
    }
}

public class Main {
    public static void main(String[] args) {
        ZooFactory carnivorousFactory = new CarnivorousAnimalZooFactory();
        Animal lion = carnivorousFactory.createAnimal();
        lion.eat();

        ZooFactory herbivorousFactory = new HerbivorousAnimalZooFactory();
        Animal deer = herbivorousFactory.createAnimal();
        deer.eat();
    }
}
