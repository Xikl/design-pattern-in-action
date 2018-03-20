# design-pattern-in-action
design-pattern-in-action
#### 1.策略模式Context 和 简单工厂模式Factory
- 策略模式可以与工厂模式相结合，屏蔽父类和工厂类
- 但是都要创建多个类
#### 2.装饰模式
- 装饰模式主体其实还是相互注入;
```
a.setComponent(base);
b.setComponent(a);
b.operation();
```