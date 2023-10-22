public class VanilaScope implements IcecreamConeConstituent{
private IcecreamConeConstituent icecreamConeConstituent;
public VanilaScope(IcecreamConeConstituent icecreamConeConstituent){
    this.icecreamConeConstituent = icecreamConeConstituent;
}
    @Override
    public String getDescription() {
        return icecreamConeConstituent.getDescription()+"+ Vanila";
    }

    @Override
    public int price() {
        return icecreamConeConstituent.price()+10;
    }
}
