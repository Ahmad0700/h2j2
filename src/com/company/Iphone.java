package com.company;

public class Iphone extends Smartphone implements Printable{
    private int price;


    public Iphone(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Цена: " + price  );

    }
}