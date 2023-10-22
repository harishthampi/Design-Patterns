public class ChocoChip implements IcecreamConeConstituent{
    private IcecreamConeConstituent icecreamConeConstituent;
    public ChocoChip(IcecreamConeConstituent icecreamConeConstituent){
        this.icecreamConeConstituent = icecreamConeConstituent;
    }
    @Override
    public String getDescription() {
        return icecreamConeConstituent.getDescription()+"+chocochip";
    }

    @Override
    public int price() {
        return icecreamConeConstituent.price()+8;
    }
}
