package io;

import models.Vodka;
import models.Whiskey;
import services.VodkaService;
import services.WhiskeyService;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    static WhiskeyService whiskeyService = new WhiskeyService();
    static VodkaService vodkaService = new VodkaService();
    public static void printWelcome(){
        System.out.println("" +
                "\n**************************************************" +
                "\n***                  Welcome                   ***" +
                "\n***                    to                      ***" +
                "\n***          Yun's Inventory Manager           ***" +
                "\n**************************************************");
    }



    public static Vodka createVodka(){

        System.out.println("To create a Vodka, please enter a name.");
        String vodkaName =scanner.nextLine();
        System.out.println("Next, please enter your brand.");
        String vodkaBrand =scanner.nextLine();
        System.out.println("Next, please enter the region.");
        String vodkaRegion=scanner.nextLine();
        System.out.println("Next, please enter the size in ml.");
        int vodkaSize= (scanner.nextInt());
        System.out.println("Next, please enter the quantity of the vodka.");
        int vodkaQty=scanner.nextInt();
        System.out.println("Lastly, please enter the price of the vodka.");
        double vodkaPrice=scanner.nextDouble();

        return vodkaService.create(vodkaName, vodkaBrand, vodkaRegion, vodkaSize, vodkaQty, vodkaPrice);
    }

    public static Whiskey createWhiskey(){

        System.out.println("To create a Vodka, please enter a name.");
        String whiskeyName =scanner.nextLine();
        System.out.println("Next, please enter your brand.");
        String whiskeyBrand =scanner.nextLine();
        System.out.println("Next, please enter the region.");
        String whiskeyRegion=scanner.nextLine();
        System.out.println("Next, please enter the size in ml.");
        int whiskeySize= (scanner.nextInt());
        System.out.println("Next, please enter the quantity of the vodka.");
        int whiskeyQty=scanner.nextInt();
        System.out.println("Lastly, please enter the price of the vodka.");
        double whiskeyPrice=scanner.nextDouble();

        return whiskeyService.create(whiskeyName, whiskeyBrand, whiskeyRegion, whiskeySize, whiskeyQty,whiskeyPrice);
    }

    public static void readFromVodkaInventory(){

        vodkaService.findAll().toString();
    }

    public static Whiskey[] readFromWhiskeyInventory (){

        return whiskeyService.findAll();
    }

    public static void updateVodkaQty(){
        System.out.println("Please enter the id of the vodka quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new quality of the item.");
        int amount = scanner.nextInt();
        vodkaService.updateVodkaQty(id, amount);
    }

    public static void updateVodkaBrand(){
        System.out.println("Please enter the id of the vodka quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new brand of the item.");
        String brand = scanner.nextLine();
        vodkaService.updateVodkaBrand(id, brand);
    }

    public static void updateVodkaRegion(){
        System.out.println("Please enter the id of the vodka quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new region of the item.");
        String region = scanner.nextLine();
        vodkaService.updateVodkaRegion(id, region);
    }

    public static void updateVodkaSize(){
        System.out.println("Please enter the id of the vodka quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new size(ml) of the item.");
        int size = scanner.nextInt();
        vodkaService.updateVodkaSize(id, size);
    }

    public static void updateVodkaPrice(){
        System.out.println("Please enter the id of the vodka quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new price of the item.");
        double price = scanner.nextInt();
        vodkaService.updateVodkaPrice(id, price);
    }

    public static void updateWhiskeyQty(){
        System.out.println("Please enter the id of the whiskey quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new quality of the item.");
        int amount = scanner.nextInt();
        whiskeyService.updateWhiskeyQty(id, amount);
    }

    public static void updateWhiskeyBrand(){
        System.out.println("Please enter the id of the whiskey quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new brand of the item.");
        String brand = scanner.nextLine();
        whiskeyService.updateWhiskeyBrand(id, brand);
    }

    public static void updateWhiskeyRegion(){
        System.out.println("Please enter the id of the whiskey quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new region of the item.");
        String region = scanner.nextLine();
        whiskeyService.updateWhiskeyRegion(id, region);
    }

    public static void updateWhiskeySize(){
        System.out.println("Please enter the id of the whiskey quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new size(ml) of the item.");
        int size = scanner.nextInt();
        whiskeyService.updateWhiskeySize(id, size);
    }

    public static void updateWhiskeyPrice(){
        System.out.println("Please enter the id of the whiskey quantity you want to change.");
        int id = scanner.nextInt();
        System.out.println("Please enter the new price of the item.");
        double price = scanner.nextInt();
        whiskeyService.updateWhiskeyPrice(id, price);
    }

    public static void deleteVodka() {
        System.out.println("Enter the id of the vodka you want to delete from the inventory.");
        int id = scanner.nextInt();
        vodkaService.delete(id);
    }

    public static void deleteWhiskey() {
        System.out.println("Enter the id of the whiskey you want to delete from the inventory.");
        int id = scanner.nextInt();
        whiskeyService.delete(id);
    }

    public static Vodka findVodka (){
        System.out.println("Enter the id of the vodka you want the report of.");
        int id = scanner.nextInt();
        return vodkaService.findVodka(id);
    }

    public static Whiskey findWhiskey (){
        System.out.println("Enter the id of the whiskey you want the report of.");
        int id = scanner.nextInt();
        return whiskeyService.findWhiskey(id);
    }


}
