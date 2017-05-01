package start;

import factory.impl.RussianFactory;
import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;

/**
 * Created by Zigzagger on 01.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();

        Aircraft aircraft = russianFactory.createAircraft();

        aircraft.flight();
    }
}
