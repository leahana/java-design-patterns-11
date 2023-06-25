package top.yannyi.designpatterns.strategy;

// 定义策略接口
interface Strategy {
    public int doOperation(int num1, int num2);
}

// 实现具体策略
class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

// 使用策略
public class StrategyPatternDemo {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new OperationAdd());
        int result = context.executeStrategy(10, 5);
        System.out.println(result); // 输出 15

        context = new StrategyContext(new OperationSubtract());
        result = context.executeStrategy(10, 5);
        System.out.println(result); // 输出 5
    }
}
