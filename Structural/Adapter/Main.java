package Structural.Adapter;
import Structural.Adapter.impl.PrinterAdapter;
import Structural.Adapter.impl.ModernPrinter;

public class Main {
    public static void main(String[] args) {
//        step 1: // Create the legacy object
        OldPrinter oldPrinter = new OldPrinter();

//        step 2: //wrap it inside the adapter
        Printer printer = new PrinterAdapter(oldPrinter);

//        step 3 : // use it like a normal printer

        printer.print("hello this is the Adpater magic!!");
    }
}