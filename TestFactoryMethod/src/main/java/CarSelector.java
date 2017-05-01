/**
 * Created by Zigzagger on 01.05.2017.
 */
public class CarSelector {

    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case MOUNTAINS:
                car = new NewGeep();
                break;
        }
        return car;
    }
}