public class BeansandFactory extends MooncakesFactory {
    @Override
    IWrapper makeWrapper() {
        return new BeansandWrapper();
    }

    @Override
    IFilling makeFilling() {
        return new BeansandFilling();
    }
}