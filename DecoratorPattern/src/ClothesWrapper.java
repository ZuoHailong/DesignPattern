/**
 * 衣服包装的抽象类
 */
public abstract class ClothesWrapper extends Person {
    private Person mPerson;

    public ClothesWrapper(Person person) {
        this.mPerson = person;
    }

    @Override
    public String dress() {
        return mPerson.dress();
    }
}
