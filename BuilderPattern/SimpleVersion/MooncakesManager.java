public class MooncakesManager{

    private Builder mBuilder = null;

    // 私有化构造，要通过Builder.build()得到实例
    private MooncakesManager(Builder mBuilder){
        this.mBuilder = mBuilder;
    }

    // 生产产品
    public Mooncakes create(){
        Mooncakes mooncakes = new Mooncakes();
        mooncakes.setWrapper(mBuilder.wrapper).setFilling(mBuilder.filling);
        return mooncakes;
    }

    /**
     * 构建器，用于管理类的初始化配置及生成管理类实例
     */
    public static class Builder{

        private String wrapper, filling;

        public Builder setWrapper(String wrapper){
            this.wrapper = wrapper;
            return this;
        }

        public Builder setFilling(String filling){
            this.filling = filling;
            return this;
        }

        // 构建得到管理类
        public MooncakesManager build(){
            return new MooncakesManager(this);
        }

    }

}