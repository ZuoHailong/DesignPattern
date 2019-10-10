import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        House houseM = new House();
        houseM.setArea(40F).setPrice(2500F);

        House houseN = new House();
        houseN.setArea(60F).setPrice(4000F);

        /*
         * 静态代理
         */
        // 代理对象
        MrA mrA = new MrA();
        // 委托对象
        RentalProxy rentalProxy = new RentalProxy(mrA);
        rentalProxy.lookHouse(houseM);
        rentalProxy.lookHouse(houseN);

        /*
         * 动态代理
         */
        InvocationHandler invocationHandler = new DynamicRentalProxy(mrA);
        IRent rent = (IRent) getProxyInstance(mrA.getClass(), invocationHandler);
        if (rent != null) {
            rent.lookHouse(houseM);
            rent.lookHouse(houseN);
        }

    }

    // 生成动态代理
    private static Object getProxyInstance(Class clz, InvocationHandler handler) {
        return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), handler);
    }

}