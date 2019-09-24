public class Mooncakes{
    
    private String wrapper;
    private String filling;

    public Mooncakes setWrapper(String mWrapper){
        this.wrapper = mWrapper;
        return this;
    }

    public String getWrapper(){
        return wrapper;
    }

    public Mooncakes setFilling(String filling){
        this.filling = filling;
        return this;
    }

    public String getFilling(){
        return filling;
    }

}