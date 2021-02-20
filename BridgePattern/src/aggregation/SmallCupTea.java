package aggregation;

public class SmallCupTea extends Tea {

    public SmallCupTea(TeaLeaf teaLeaf) {
        super(teaLeaf);
    }

    @Override
    public String makeTea() {
        return "上小杯" + teaLeaf.addTeaLeaf();
    }
}
