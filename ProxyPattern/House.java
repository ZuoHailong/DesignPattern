public class House{

    private float price;
    private float area;
    // 新旧程度（N成新）
    private float newPercent;

    public float getPrice(){
        return this.price;
    }

    public House setPrice(float price){
        this.price = price;
        return this;
    }

    public House setArea(float area){
        this.area = area;
        return this;
    }

    public float getArea(){
        return this.area;
    }

    public House setNewPercent(float newPercent){
        this.newPercent = newPercent;
        return this;
    }

    public float getNewPercent(){
        return this.newPercent;
    }

}