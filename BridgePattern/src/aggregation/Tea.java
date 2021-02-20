package aggregation;

public abstract class Tea {

    protected TeaLeaf teaLeaf;

    public Tea(TeaLeaf teaLeaf) {
        this.teaLeaf = teaLeaf;
    }

    public abstract String makeTea();
}
