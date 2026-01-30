package  Structural.Adapter.impl;

import Structural.Adapter.Printer;
import Structural.Adapter.OldPrinter;


public class PrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    // constructor should be public as it is called in another package.
    public PrinterAdapter(OldPrinter oldPrinter){
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String message) {
        oldPrinter.printText(message);
    }
}