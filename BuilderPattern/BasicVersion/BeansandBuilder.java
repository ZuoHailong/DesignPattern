public class BeansandBuilder extends Builder {

    private Mooncakes mMooncakes = new Mooncakes();

    @Override
    Builder setWrapper(String mWrapper) {
        mMooncakes.setWrapper(mWrapper);
        System.out.println("月饼皮：" + mWrapper);
        return this;
    }

    @Override
    Builder setFilling(String mFilling) {
        mMooncakes.setFilling(mFilling);
        System.out.println("月饼馅：" + mFilling);
        return this;
    }

    @Override
    Mooncakes build() {
        System.out.println("月饼做好了");
        return mMooncakes;
    }

}