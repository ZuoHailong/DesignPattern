/**
 * 静态代理 —— 租赁代理
 */
public class RentalProxy implements IRent {

    private IRent mRent;

    public RentalProxy(IRent mRent) {
        this.mRent = mRent;
    }

    @Override
    public boolean lookHouse(House house) {

        if (house.getArea() < 50) {
            System.out.println("太小了，不符合小A的要求，不用通知小A去看房" + house.getName() + "了");
            return false;
        }

        // 执行代理对象的真实逻辑
        return mRent.lookHouse(house);
    }

    @Override
    public void signContract() {
        mRent.signContract();
    }

}