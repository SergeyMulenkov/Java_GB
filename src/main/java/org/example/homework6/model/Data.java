package org.example.homework6.model;

import java.util.HashSet;
import java.util.Set;

public class Data {
    public static Set<Laptop> baseLaptopSet(){
        Set<Laptop> laptopsSet = new HashSet<>();

        laptopsSet.add(new Laptop("ASUS", "Linux", 1000, 64, 4));
        laptopsSet.add(new Laptop("Lenovo","Windows10Home",2000,8,6));
        laptopsSet.add(new Laptop("Acer","Windows10Home",120,16,8));
        laptopsSet.add(new Laptop("DELL","Windows11Home",500,16,12));
        laptopsSet.add(new Laptop("SAMSUNG","DOS",4000,16,12));
        laptopsSet.add(new Laptop("Apple","MacOS",240,16,8));
        laptopsSet.add(new Laptop("ASUS","Windows11Home",1000,16,6));
        laptopsSet.add(new Laptop("Lenovo","Windows10Home",1000,32,4));
        laptopsSet.add(new Laptop("Acer","Windows11Home",2000,16,4));
        return laptopsSet;
    }
}

