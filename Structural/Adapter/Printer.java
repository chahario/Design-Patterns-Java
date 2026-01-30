package Structural.Adapter;
// Interface

public interface Printer {
    public void print(String message);
}
//Interface cannot be private
//It can but only in nested classes, where no outside class use it