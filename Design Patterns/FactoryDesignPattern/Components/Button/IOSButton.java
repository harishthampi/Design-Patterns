package FactoryDesignPattern.Components.Button;

public class IOSButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("IOS Button Size changed");
    }
}
