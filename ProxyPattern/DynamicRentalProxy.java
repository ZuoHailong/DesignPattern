import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理 —— 租赁代理
 */
public class DynamicRentalProxy implements InvocationHandler{

    private Object object;

    public DynamicRentalProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射得到被代理类
        Object obj =  method.invoke(object, args);
        return obj;
    }

    public <T extends IRentTest> T get(Class<T> clz) {
        IRentTest mooncakes = null;
        try {
            mooncakes = (IRentTest) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) mooncakes;
    }

}