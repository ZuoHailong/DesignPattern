import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main{

    public static void main(String[] args) {

        House house = new House();
        house.setArea(40F).setPrice(2500F).setNewPercent(0.8F);

        /*
         * 静态代理
         */
        // 被代理人
        MrA mrA = new MrA();
        // 代理人
        RentalProxy rentalProxy = new RentalProxy(mrA);
        boolean lookResult =  rentalProxy.lookHouse(house);
        if(lookResult){
            rentalProxy.signContract();
        }

        /*
         * 动态代理
         */
        InvocationHandler invocationHandler = new DynamicRentalProxy(mrA);
        IRent rent = (IRent)getProxyInstance(mrA.getClass(), invocationHandler);
        if(rent.lookHouse(house)){
            rent.signContract();
        }

        DynamicRentalProxy dynamicRentalProxy = new DynamicRentalProxy(mrA);
        MrB mrB = new MrB();
        IRentTest rentB = (IRentTest)dynamicRentalProxy.get(mrB.getClass());
        rentB.lookHouse(house);
    }

    // 得到动态代理人
    private static Object getProxyInstance(Class clz, InvocationHandler handler){
        return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), handler);
    }

}