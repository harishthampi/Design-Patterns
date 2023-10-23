package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.Android);
        Button button = uiFactory.CreateButton();
        button.changeSize();
    }

}
