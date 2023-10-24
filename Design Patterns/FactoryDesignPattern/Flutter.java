package FactoryDesignPattern;

public class Flutter {
    void setTheme(){

    }
    void  setRefreshRate(){

    }
    UIFactory createUIFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.Android)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
