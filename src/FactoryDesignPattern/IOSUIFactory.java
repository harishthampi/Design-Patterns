package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.AndroidButton;
import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.IOSButton;
import FactoryDesignPattern.Components.DropDown.AndroidDropDown;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.DropDown.IOSDropDown;
import FactoryDesignPattern.Components.Menu.AndroidMenu;
import FactoryDesignPattern.Components.Menu.IOSMenu;
import FactoryDesignPattern.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button CreateButton() {
        return new IOSButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown CreateDropDown() {
        return new IOSDropDown();
    }
}
