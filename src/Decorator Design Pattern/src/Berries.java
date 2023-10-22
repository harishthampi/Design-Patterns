public class Berries implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public Berries(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent = icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        return icecreamConeConstituent.getDescription()+"+ Berries";
    }

    @Override
    public int price() {
        return icecreamConeConstituent.price()+5;
    }
}
