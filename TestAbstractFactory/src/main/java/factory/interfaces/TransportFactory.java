package factory.interfaces;

import transport.interfaces.Aircraft;
import transport.interfaces.Car;
/**
 * Created by Zigzagger on 01.05.2017.
 */
//Фабрика по созданию транспорта
public interface TransportFactory {
    //Фабрика производит автомобили
    Car createCar();
    //Фабрика производит самолеты
    Aircraft createAircraft();
}
