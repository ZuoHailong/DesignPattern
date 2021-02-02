public class Main {
    public static void main(String[] args) {
        // 基础穿着
        Person tom = new Boy();
        System.out.println(tom.dress());

        // 基础穿着 + 衬衣
        ShirtWrapper shirtWrapper = new ShirtWrapper(tom);
        System.out.println(shirtWrapper.dress());

        // 基础穿着 + 外套
        CoatWrapper coatWrapper = new CoatWrapper(tom);
        System.out.println(coatWrapper.dress());

        // 基础穿着 + 衬衣 + 外套
        CoatWrapper fullDress = new CoatWrapper(shirtWrapper);
        System.out.println(fullDress.dress());
    }
}
