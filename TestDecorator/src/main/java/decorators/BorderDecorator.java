package decorators;

import objects.Component;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component){
        super(component);
    }

    public void afterDraw(){
        System.out.println("... add border");
    }
}
