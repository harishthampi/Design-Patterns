package DecoratorDesignPattern;

public class OrangeCone implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public OrangeCone(){

    }
    public OrangeCone(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent=icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        if(icecreamConeConstituent!=null){
            return icecreamConeConstituent.getDescription()+"+ DecoratorDesignPattern.OrangeCone";
        }
        return "DecoratorDesignPattern.OrangeCone";
    }

    @Override
    public int price() {
        if(icecreamConeConstituent!=null){
            return icecreamConeConstituent.price()+10;
        }
        return 10;
    }
}
