# design-pattern-in-action
design-pattern-in-action
#### 1.策略模式Context 和 简单工厂模式Factory
- 策略模式可以与工厂模式相结合，屏蔽父类和工厂类
- 但是都要创建多个类
- 使用java8 lambda 表达式 可以简化 策略模式的代码
```java

public interface ValidationStrategy {
    boolean execute(String s);
}

public class Validator{
    private final ValidationStrategy strategy;
    
    public Validator(ValidationStrategy v){
        this.strategy = v;
    }
    public boolean validate(String s){
        return strategy.execute(s);
    }
}

public class Main{
    public static void main(String[] args){
      //java8
      Validator numericValidator =
          new Validator((String s) -> s.matches("[a-z]+"));
      boolean b1 = numericValidator.validate("aaaa");
      Validator lowerCaseValidator =
          new Validator((String s) -> s.matches("\\d+"));
      boolean b2 = lowerCaseValidator.validate("bbbb");
    }
}

```

#### 2.装饰模式
- 装饰模式主体其实还是相互注入;
```
a.setComponent(base);
b.setComponent(a);
b.operation();
```

#### 3.发布订阅模式（观察者模式）
- 3.1 观察者需要有 增删和通知观察者(订阅者)的能力(方法)
- 3.2 观察者需要实现一个接口（`Observer`）来获得更新自我的能力
这个方法需要有两个参数（Observable o, T arg）来进行操作