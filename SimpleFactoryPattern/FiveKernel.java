public class FiveKernel extends Mooncakes{
    @Override
    public Mooncakes makeWrapper() {
        System.out.println("五仁月饼·皮好了");
        return this;
    }

    @Override
    public Mooncakes makeFilling() {
        System.out.println("五仁月饼·馅好了");
        return this;
    }

    @Override
    public void makeMooncakes() {
        System.out.println("五仁月饼·吃吧\n");
    }
}