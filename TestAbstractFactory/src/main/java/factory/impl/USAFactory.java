package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircraft.Boeing747;
import transport.impl.car.Porsche;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

/**
 * Created by Zigzagger on 01.05.2017.
 */
public class USAFactory implements TransportFactory{

    public Car createCar(){
        return new Porsche();
    }

    public Aircraft createAircraft(){
        return new Boeing747();
    }
}
