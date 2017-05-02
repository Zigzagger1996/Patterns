package adapter;

import objects.Printer;

import java.util.List;

/**
 * Created by Zigzagger on 02.05.2017.
 */
public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();

    public void print(List<String> list){
        for (String text : list){
            printer.print(text);
        }
    }
}
