package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircraft.TU134;
import transport.impl.car.Niva;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;


/**
 * Created by Zigzagger on 01.05.2017.
 */
public class RussianFactory implements TransportFactory{

    public Car createCar(){
        return new Niva();
    }

    public Aircraft createAircraft(){
        return new TU134();
    }
}
