package decorators;

import objects.Component;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component){
        super(component);
    }

    public void afterDraw(){
        System.out.println("... add color");
    }
}
