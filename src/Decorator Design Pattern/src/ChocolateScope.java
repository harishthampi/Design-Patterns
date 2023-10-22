public class ChocolateScope implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public ChocolateScope(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent = icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        return icecreamConeConstituent.getDescription()+"+ ChocolateScope";
    }

    @Override
    public int price() {
        return icecreamConeConstituent.price()+15;
    }
}
