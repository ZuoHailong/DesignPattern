public class MrA implements IRent{
    
    @Override
    public boolean lookHouse(House house){
        // 被代理类执行实际的业务
        if(house.getNewPercent() < 0.8){
            System.out.println("房子太旧了，不喜欢");
            return false;
        }
        System.out.println("小A先生去看了房子");
        return true;
    }

    @Override
    public void signContract() {
        System.out.println("小A先生签了租赁合同");
    }

}