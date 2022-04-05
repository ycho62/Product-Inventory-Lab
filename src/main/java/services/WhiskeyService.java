package services;



import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {
    private static int nextId = 1;  // (1)

    private ArrayList<Whiskey> inventory = new ArrayList<>();  // (2)

    // (1)
    public Whiskey create(String name, String brand, String region, int size, int quantity, double price) {

        // (2)
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, region, size, quantity, price);

        // (3)
        inventory.add(createdWhiskey);

        // (4)
        return createdWhiskey;
    }
    //read
    public Whiskey findWhiskey(int id) {
        for(Whiskey n : inventory){
            if( n.getId() == id){
                return n;
            }

        }
        return null;
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Whiskey[] findAll() {
        // should return a basic array copy of the ArrayList
        Whiskey[] list = new Whiskey[inventory.size()];
        for (int i= 0; i<list.length; i++){
            list[i] = inventory.get(i);
        }

        return list;
    }

    //delete
    public boolean delete(int id) {
        if(inventory.contains(findWhiskey(id))){
            inventory.remove(findWhiskey(id));
            return true;
        }else return false;
//        // should remove the object with this id from the ArrayList if exits and return true.
//        // Otherwise return false
    }
    public void updateWhiskeyQty(int id, int amount){
        inventory.get(id).setQty(amount);
    }

    public void updateWhiskeyBrand(int id, String brand){
        inventory.get(id).setBrand(brand);
    }

    public void updateWhiskeyRegion(int id, String region){
        inventory.get(id).setRegion(region);
    }

    public void updateWhiskeySize(int id, int size){
        inventory.get(id).setSize(size);
    }

    public void updateWhiskeyPrice(int id, double price){
        inventory.get(id).setPrice(price);
    }
}
