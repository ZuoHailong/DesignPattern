public class Main {
    public static void main(String[] args) {
        MooncakesFactory.makeMooncakes(1).makeWrapper().makeFilling().makeMooncakes();
        MooncakesFactory.makeMooncakes(2).makeWrapper().makeFilling().makeMooncakes();

        MooncakesFactory.makeMooncakes(FiveKernel.class).makeWrapper().makeFilling().makeMooncakes();
        MooncakesFactory.makeMooncakes(Beansand.class).makeWrapper().makeFilling().makeMooncakes();
    }
}