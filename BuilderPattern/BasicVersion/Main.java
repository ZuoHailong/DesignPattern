public class Main{

    public static void main(String[] args) {
        // 创建构建器
        Builder beansandBuilder = new BeansandBuilder();
        // 注入构建器，创建导演类
        Director mDirector = new Director(beansandBuilder);
        // 开始构建产品
        mDirector.construct("金黄色的皮", "红豆沙的馅");
    }

}