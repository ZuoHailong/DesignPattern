public class Main {

    public static void main(String[] args) {
        // MooncakesFactory.makeMooncakes("FiveKernel").eat();
        // MooncakesFactory.makeMooncakes("Beansand").eat();

        MooncakesFactory.makeMooncakes(FiveKernel.class).eat();
        MooncakesFactory.makeMooncakes(Beansand.class).eat();
    }
    
}