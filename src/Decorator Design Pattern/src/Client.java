public class Client {
    public static void main(String[] args) {
        IcecreamConeConstituent icecream =
                new Berries(
                        new ButterscotchScope(
                                new ChocoChip(
                                     new ChocolateScope(
                                            new VanilaScope(
                                                    new ChocolateCone(
                                                            new OrangeCone()
                                                    )
                                            )
                                     )
                                )
                        )

                );
        System.out.println(icecream.getDescription());
        System.out.println(icecream.price());
    }
}
