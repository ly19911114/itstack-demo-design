package org.itstack.demo.design.teacoffice;

public abstract class CaffeineBeverageWithHook {

    // 模板方法，用来控制泡茶的流程
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 钩子方法，子类可以覆盖，提供一个默认实现
    public boolean customerWantsCondiments() {
        return true;
    }

    //冲泡原料 抽象方法，子类必须实现
    public abstract void brew();

    //加调料 抽象方法，子类必须实现
    public abstract void addCondiments();

    //水煮沸 具体方法，子类可以覆盖
    public void boilWater() {
        System.out.println("Boiling water");
    }

    //把饮料倒进杯子 具体方法，子类可以覆盖
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
