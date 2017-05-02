package decorators;

import objects.Component;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator (Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    public void draw(){
        component.draw();
        afterDraw();
    }
}
