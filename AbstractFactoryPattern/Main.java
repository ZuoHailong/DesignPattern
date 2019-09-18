public class Main {
    public static void main(String[] args) {
        // 五仁月饼
        MooncakesFactory fivekernelFactory = new FivekernelFactory();
        fivekernelFactory.makeWrapper().make();
        fivekernelFactory.makeFilling().make();

        // 豆沙月饼
        MooncakesFactory beansandFactory = new BeansandFactory();
        beansandFactory.makeWrapper().make();
        beansandFactory.makeFilling().make();
    }
}