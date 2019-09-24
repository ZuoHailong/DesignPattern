public class Director {

    private Builder mBuilder = null;

    // 实例化时设定构造器
    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    // 开始构造产品
    public Mooncakes construct(String mWrapper, String mFilling) {
        return mBuilder.setWrapper(mWrapper).setFilling(mFilling).build();
    }
    
}