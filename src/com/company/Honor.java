package com.company;

public class Honor extends Smartphone implements Printable {
    private int snapdragon;


    public Honor(String name,int snapdragon) {
        super(name);
        this.snapdragon = snapdragon;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Snapdragon: " + snapdragon );
    }
}