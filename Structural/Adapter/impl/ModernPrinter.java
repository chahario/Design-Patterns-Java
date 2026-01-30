package Structural.Adapter.impl;

import Structural.Adapter.Printer;
import Structural.Adapter.OldPrinter;

public class ModernPrinter implements Printer{

    @Override
    public void print(String message)
    {
        System.out.println("Modern Printer:"+ message);
    }
}