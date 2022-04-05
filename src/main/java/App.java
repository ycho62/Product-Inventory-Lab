import io.Console;
import models.Vodka;
import models.Whiskey;
import services.VodkaService;
import services.WhiskeyService;

import java.util.Scanner;

public class App {
    private VodkaService vodkaService = new VodkaService(); // (1)
    private WhiskeyService whiskeyService = new WhiskeyService();
    private Console console = new Console();
    private Vodka vodka = new Vodka();
    private Whiskey whiskey = new Whiskey();
    static boolean exit = false;
    Scanner scanner = new Scanner(System.in);



    public static void main(String... args) {
        App application = new App(); // (2)
        application.init();  // (3)
    }

    public void init() {
        console.printWelcome();
        while (!exit) {
            System.out.println("Please select which inventory you want." +
                    "\n 1. Vodka" +
                    "\n 2. Whiskey");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Please choose one of these options." +
                        "\n 1. Add new vodka product" +
                        "\n 2. Read from current vodka inventory" +
                        "\n 3. Update current vodka product" +
                        "\n 4. Delete vodka product from inventory" +
                        "\n 5. Get report for a vodka product" +
                        "\n 6. Exit");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        console.createVodka();
                        break;

                    case 2:
                        console.readFromVodkaInventory();
                        break;

                    case 3:
                        System.out.println("Please choose one of these options to update." +
                                "\n 1. Update vodka quantity" +
                                "\n 2. Update vodka brand" +
                                "\n 3. Update vodka region" +
                                "\n 4. Update vodka size (ml)" +
                                "\n 5. Update vodka price");
                        int option2 = scanner.nextInt();
                        switch (option2) {
                            case 1:
                                console.updateVodkaQty();
                                break;

                            case 2:
                                console.updateVodkaBrand();
                                break;

                            case 3:
                                console.updateVodkaRegion();
                                break;

                            case 4:
                                console.updateVodkaSize();
                                break;

                            case 5:
                                console.updateVodkaPrice();
                                break;

                        }
                        break;

                    case 4:
                        console.deleteVodka();
                        break;

                    case 5:
                        console.findVodka();
                        break;

                    case 6:
                        exit = true;
                        break;
                }
            } else if (selection == 2) {
                System.out.println("Please choose one of these options." +
                        "\n 1. Add new whiskey product" +
                        "\n 2. Read from current whiskey inventory" +
                        "\n 3. Update current whiskey product" +
                        "\n 4. Delete whiskey product from inventory" +
                        "\n 5. Get report for a whiskey product" +
                        "\n 6. Exit");
                int option3 = scanner.nextInt();
                switch (option3) {
                    case 1:
                        console.createWhiskey();
                        break;

                    case 2:
                        Console.readFromWhiskeyInventory();
                        break;

                    case 3:
                        System.out.println("Please choose one of these options to update." +
                                "\n 1. Update whiskey quantity" +
                                "\n 2. Update whiskey brand" +
                                "\n 3. Update whiskey region" +
                                "\n 4. Update whiskey size (ml)" +
                                "\n 5. Update whiskey price");
                        int option4 = scanner.nextInt();

                        switch (option4) {
                            case 1:
                                console.updateWhiskeyQty();
                                break;

                            case 2:
                                console.updateWhiskeyBrand();
                                break;

                            case 3:
                                console.updateWhiskeyRegion();
                                break;

                            case 4:
                                console.updateWhiskeySize();
                                break;

                            case 5:
                                console.updateWhiskeyPrice();
                                break;
                            }


                    case 4:
                        console.deleteWhiskey();
                        break;

                    case 5:
                        console.findWhiskey();
                        break;

                    case 6:
                        exit = true;
                        break;
                    }
                }
            }


            // (4)
            // application logic here
            // call methods to take user input and interface with services

        }
    }




