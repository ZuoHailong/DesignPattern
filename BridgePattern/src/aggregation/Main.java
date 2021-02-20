package aggregation;

public class Main {
    public static void main(String[] args) {

        LargeCupTea largeCupRedTea = new LargeCupTea(new RedLeaf());
        System.out.println(largeCupRedTea.makeTea());

        SmallCupTea smallupRedTea = new SmallCupTea(new RedLeaf());
        System.out.println(smallupRedTea.makeTea());

        LargeCupTea largeCupGreenTea = new LargeCupTea(new GreenLeaf());
        System.out.println(largeCupGreenTea.makeTea());

        SmallCupTea smallCupGreenTea = new SmallCupTea(new GreenLeaf());
        System.out.println(smallCupGreenTea.makeTea());

    }
}
