/**
 * 衬衣包装类
 */
public class ShirtWrapper extends ClothesWrapper {
    public ShirtWrapper(Person person) {
        super(person);
    }

    @Override
    public String dress() {
        return super.dress() + "衬衣 ";
    }
}
