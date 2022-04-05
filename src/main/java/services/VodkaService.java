package services;

import models.Vodka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class VodkaService {
    private static int nextId = 1;  // (1)

    private ArrayList<Vodka> inventory = new ArrayList<>();  // (2)

    // (1)
    public Vodka create(String name, String brand, String region, int size, int quantity, double price) {

        // (2)
        Vodka createdVodka = new Vodka(nextId++, name, brand, region, size, quantity, price);

        // (3)
        inventory.add(createdVodka);

        // (4)
        return createdVodka;
    }
    //read
    public Vodka findVodka(int id) {
        for(Vodka n : inventory){
            if( n.getId() == id){
                return n;
            }

        }
        return null;
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Vodka[] findAll() {
        // should return a basic array copy of the ArrayList
        Vodka[] list = new Vodka[inventory.size()];
        for (int i= 0; i<list.length; i++){
            list[i] = inventory.get(i);
            System.out.println(list[i].toString());
        }

        return list;
    }

    //delete
    public boolean delete(int id) {
        if(inventory.contains(findVodka(id))){
            inventory.remove(findVodka(id));
            return true;
        }else return false;
//        // should remove the object with this id from the ArrayList if exits and return true.
//        // Otherwise return false
    }

    public void updateVodkaQty(int id, int amount){
        inventory.get(id).setQty(amount);
    }

    public void updateVodkaBrand(int id, String brand){
        inventory.get(id).setBrand(brand);
    }

    public void updateVodkaRegion(int id, String region){
        inventory.get(id).setRegion(region);
    }

    public void updateVodkaSize(int id, int size){
        inventory.get(id).setSize(size);
    }

    public void updateVodkaPrice(int id, double price){
        inventory.get(id).setPrice(price);
    }


}
