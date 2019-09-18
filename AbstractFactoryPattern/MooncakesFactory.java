public abstract class MooncakesFactory {
    /**
     * 生产月饼皮的产品接口
     * 
     * @return IWrapper
     */
    abstract IWrapper makeWrapper();

    /**
     * 生产月饼馅的产品接口
     * 
     * @return IFilling
     */
    abstract IFilling makeFilling();
}