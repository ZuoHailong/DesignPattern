public class MooncakesFactory {

    public static Mooncakes makeMooncakes(int type) {
        Mooncakes mooncakes = null;
        switch (type) {
        case 1:
            mooncakes = new FiveKernel();
            break;
        case 2:
            mooncakes = new Beansand();
            break;
        }
        return mooncakes;
    }

    public static <T extends Mooncakes> T makeMooncakes(Class<T> clz) {
        Mooncakes mooncakes = null;
        try {
            mooncakes = (Mooncakes) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)mooncakes;
    }

}