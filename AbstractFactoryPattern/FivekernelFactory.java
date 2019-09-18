public class FivekernelFactory extends MooncakesFactory {
    @Override
    IWrapper makeWrapper() {
        return new FivekernelWrapper();
    }

    @Override
    IFilling makeFilling() {
        return new FivekernelFilling();
    }
}