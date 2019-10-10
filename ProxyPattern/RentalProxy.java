/**
 * 静态代理 —— 租赁代理
 */
public class RentalProxy implements IRent{

    private IRent rent;

    public RentalProxy(IRent rent){
        this.rent = rent;
    }

    @Override
    public boolean lookHouse(House house) {

        if(house.getArea() < 50){
            System.out.println("太小了，不符合小A的要求，不用通知小A去看房了");
            return false;
        }

        // 执行代理对象的真实逻辑
        return rent.lookHouse(house);
    }

    @Override
    public void signContract() {
        rent.signContract();
    }

}