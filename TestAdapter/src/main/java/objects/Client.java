package objects;

import adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class Client {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("1text");
        list.add("2text");
        list.add("3text");
        list.add("4text");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
