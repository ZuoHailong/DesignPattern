public class Main {
    public static void main(String[] args) {
        MooncakesFactory.makeMooncakes("FiveKernel").makeWrapper().makeFilling().makeMooncakes();
        MooncakesFactory.makeMooncakes("Beansand").makeWrapper().makeFilling().makeMooncakes();

        MooncakesFactory.makeMooncakes(FiveKernel.class).makeWrapper().makeFilling().makeMooncakes();
        MooncakesFactory.makeMooncakes(Beansand.class).makeWrapper().makeFilling().makeMooncakes();
    }
}