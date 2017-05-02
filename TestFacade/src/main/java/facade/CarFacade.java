package facade;

import parts.Door;
import parts.Ignition;
import parts.Wheel;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class CarFacade {

    private Door door = new Door();
    private Ignition ignition = new Ignition();
    private Wheel wheel = new Wheel();

    public void go(){
        door.doorOpen();
        ignition.ignitionOn();
        wheel.wheelTurn();
    }

}
