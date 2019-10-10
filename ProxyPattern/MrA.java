public class MrA implements IRent{
    
    @Override
    public boolean lookHouse(House house){
        // 代理对象执行实际的业务
        System.out.println("小A去看了房子");
        return true;
    }

    @Override
    public void signContract() {
        // 代理对象执行实际的业务
        System.out.println("小A签了租赁合同");
    }

}