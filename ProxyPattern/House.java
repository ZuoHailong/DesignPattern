public class House{

    private float price;
    private float area;

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

}