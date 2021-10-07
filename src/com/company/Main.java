package com.company;

public class Main {

    public static void main(String[] args){
        createObject("Samsung").print();
        createObject("Honor").print();
        createObject("Iphone").print();
    }

    private static Printable createObject(String name) {
        Printable temp = null;
        switch(name) {
            case "Samsung":
                temp = new Samsung("Samsung", 793445);
                break;

            case "Honor":
                temp = new Honor("Honor", 888);
                break;

            case "Iphone":
                temp = new Iphone("Iphone", 98739);
                break;
            default:
                return temp;
        }
        return temp;
    }
}