package inherit;

public class Main {
    public static void main(String[] args) {
        GreenTea greenTea = new GreenTea();
        System.out.println(greenTea.makeTea());

        LargeCupGreenTea largeCupGreenTea = new LargeCupGreenTea();
        System.out.println(largeCupGreenTea.makeTea());

        SmallCupGreenTea smallCupGreenTea = new SmallCupGreenTea();
        System.out.println(smallCupGreenTea.makeTea());

        RedTea redTea = new RedTea();
        System.out.println(redTea.makeTea());

        LargeCupRedTea largeCupRedTea = new LargeCupRedTea();
        System.out.println(largeCupRedTea.makeTea());

        SmallCupRedTea smallCupRedTea = new SmallCupRedTea();
        System.out.println(smallCupRedTea.makeTea());
    }
}
