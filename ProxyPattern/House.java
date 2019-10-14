public class House{

    // 房屋名
    private String name;
    // 价格
    private float price;
    // 面积
    private float area;

    public String getName(){
        return this.name;
    }

    public House setName(String name){
        this.name = name;
        return this;
    }

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