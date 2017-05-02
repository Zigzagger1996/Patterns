package decorators;

import objects.Component;
import objects.Window;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        Component windowWithBorderAndColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorderAndColor.draw();
    }
}
