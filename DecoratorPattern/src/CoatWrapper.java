/**
 * 外套包装类
 */
public class CoatWrapper extends ClothesWrapper {
    public CoatWrapper(Person person) {
        super(person);
    }

    @Override
    public String dress() {
        return super.dress() + "外套 ";
    }
}
