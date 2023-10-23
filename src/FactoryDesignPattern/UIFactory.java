package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.Menu.Menu;

public interface UIFactory {
    Button CreateButton();
    Menu CreateMenu();
    DropDown CreateDropDown();
}
