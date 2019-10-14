import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的生成类
 */
public class DynamicPurchasing implements InvocationHandler {

    private Object object;

    public DynamicPurchasing(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射得到代理对象
        if ("lookHouse".equals(method.getName())) {
            House house = (House) args[0];
            if (house.getArea() < 50) {
                System.out.println("太小了，不符合小A的要求，不用通知小A去看房" + house.getName() + "了");
                return null;
            }
        }
        Object result = method.invoke(object, args);
        return result;
    }

}