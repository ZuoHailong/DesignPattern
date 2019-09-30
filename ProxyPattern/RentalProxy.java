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
        if(house.getPrice() > 3000){
            System.out.println("太贵了");
            return false;
        }

        if(house.getArea() < 30){
            System.out.println("太小了");
            return false;
        }

        // 执行被代理人的真实逻辑
        return rent.lookHouse(house);
    }

    @Override
    public void signContract() {
        rent.signContract();
    }

}