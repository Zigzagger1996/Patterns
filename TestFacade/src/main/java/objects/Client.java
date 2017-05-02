package objects;

import facade.CarFacade;
import parts.Door;
import parts.Ignition;
import parts.Wheel;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        door.doorOpen();

        Ignition ignition = new Ignition();
        ignition.ignitionOn();

        Wheel wheel = new Wheel();
        wheel.wheelTurn();

        CarFacade carFacade = new CarFacade();
        carFacade.go();

    }
}
