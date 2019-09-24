public abstract class Builder{
    
    // 构建月饼皮
    abstract Builder setWrapper(String mWrapper);

    // 构建月饼馅
    abstract Builder setFilling(String mFilling);

    // 完成月饼构建
    abstract Mooncakes build();
    
}