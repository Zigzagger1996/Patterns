package transport.impl.car;

import transport.interfaces.Car;

/**
 * Created by Zigzagger on 01.05.2017.
 */
public class Niva implements Car{

    public void drive(){
        System.out.println("Niva drive");
    }

    public void stop(){
        System.out.println("Niva stop");
    }
}
