package com.company;

public class Samsung extends Smartphone implements Printable{

    private int antutuTest;

    public Samsung(String name,int antutuTest) {
        super(name);
        this.antutuTest = antutuTest;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "Баллы Антуту теста: " + antutuTest);
    }
}
