public class ButterscotchScope implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public ButterscotchScope(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent = icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        return icecreamConeConstituent.getDescription()+"+ ButterscotchScope";
    }

    @Override
    public int price() {
        return icecreamConeConstituent.price()+10;
    }
}
