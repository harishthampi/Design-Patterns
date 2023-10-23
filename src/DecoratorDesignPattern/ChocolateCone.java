package DecoratorDesignPattern;

public class ChocolateCone implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public ChocolateCone(){

    }
    public ChocolateCone(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent = icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        if(icecreamConeConstituent != null){
            return icecreamConeConstituent.getDescription()+"+ DecoratorDesignPattern.ChocolateCone";
        }
        return "DecoratorDesignPattern.ChocolateCone";
    }

    @Override
    public int price() {
        if(icecreamConeConstituent != null){
            return icecreamConeConstituent.price()+12;
        }
        return 12;
    }
}
