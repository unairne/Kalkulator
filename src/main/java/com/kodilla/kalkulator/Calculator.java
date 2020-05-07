package com.kodilla.kalkulator;

public class Calculator {
    public void someMethod (){
    }
    private double acumulator;

    public Calculator() {
        acumulator = 0;
    }
    public double getAcumulator() {
        return acumulator;
    }
    public void setAcumulator(double acumulator) {
        this.acumulator = acumulator;
    }
    public void add(double number) {
        acumulator += number;
    }
    public void subtract(double number) {
        acumulator -= number;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setAcumulator(-3.8);
        calculator.add(10.5);
        calculator.subtract(12.2);
        System.out.println("Calculator result: " + calculator.getAcumulator());
    }
}
