public class FivekernelFactory extends MooncakesFactory {

    @Override
    public Mooncakes makeMooncakes() {
        return new FiveKernel();
    }
    
}