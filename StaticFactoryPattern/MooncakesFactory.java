public class MooncakesFactory {

public static Mooncakes makeMooncakes(String type) {
        Mooncakes mooncakes = null;
        switch (type) {
        case "FiveKernel":
            mooncakes = new FiveKernel();
            break;
        case "Beansand":
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
        return (T) mooncakes;
    }

}