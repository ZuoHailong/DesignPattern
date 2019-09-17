public class Main {
    public static void main(String[] args) {
        // 五仁
        MooncakesFactory fivekernelFactory = new FivekernelFactory();
        fivekernelFactory.makeMooncakes().eat();

        // 豆沙
        MooncakesFactory beansandFactory = new BeansandFactory();
        beansandFactory.makeMooncakes().eat();
    }
}