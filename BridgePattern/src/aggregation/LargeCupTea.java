package aggregation;

public class LargeCupTea extends Tea {

    public LargeCupTea(TeaLeaf teaLeaf) {
        super(teaLeaf);
    }

    @Override
    public String makeTea() {
        return "上大杯" + teaLeaf.addTeaLeaf();
    }
}
