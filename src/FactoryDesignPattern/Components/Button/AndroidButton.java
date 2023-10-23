package FactoryDesignPattern.Components.Button;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Android Button Size changed");
    }
}
