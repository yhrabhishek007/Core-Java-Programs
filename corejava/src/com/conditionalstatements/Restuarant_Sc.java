package com.conditionalstatements;

import java.util.Scanner;

public class Restuarant_Sc {

    public static void main(String[] args) {

        System.out.println("Welcome to Hotel Paradise");
        Scanner sc = new Scanner(System.in);

        int total = 0;
        String choice;

        do {

            System.out.println("Enter Category: Veg / Non-veg");
            String caty = sc.next().toLowerCase();

            switch (caty) {

                case "non-veg" -> {

                    System.out.println("Enter Non-veg Biryani:");
                    sc.nextLine();
                    String biryani = sc.nextLine().toLowerCase();

                    switch (biryani) {
                        case "hyderabadi special chicken biryani" -> { System.out.println("Price: 300"); total += 300; }
                        case "chicken fry piece biryani" -> { System.out.println("Price: 250"); total += 250; }
                        case "chicken dum biryani" -> { System.out.println("Price: 220"); total += 220; }
                        case "chicken mughlai biryani" -> { System.out.println("Price: 270"); total += 270; }
                        case "chicken tikka biryani" -> { System.out.println("Price: 260"); total += 260; }
                        case "chicken keema biryani" -> { System.out.println("Price: 240"); total += 240; }
                        case "mutton dum biryani" -> { System.out.println("Price: 450"); total += 450; }
                        case "hyderabadi mutton biryani" -> { System.out.println("Price: 500"); total += 500; }
                        case "mutton fry piece biryani" -> { System.out.println("Price: 490"); total += 490; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Non-veg Starter:");
                    String starters = sc.nextLine().toLowerCase();

                    switch (starters) {
                        case "chicken 65" -> { System.out.println("Price: 269"); total += 269; }
                        case "chicken tikka" -> { System.out.println("Price: 299"); total += 299; }
                        case "chicken lollipop" -> { System.out.println("Price: 289"); total += 289; }
                        case "chicken kabab" -> { System.out.println("Price: 319"); total += 319; }
                        case "apollo fish" -> { System.out.println("Price: 349"); total += 349; }
                        case "dragon chicken" -> { System.out.println("Price: 329"); total += 329; }
                        case "mutton seekh kabab" -> { System.out.println("Price: 399"); total += 399; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Non-veg Curry:");
                    String curries = sc.nextLine().toLowerCase();

                    switch (curries) {
                        case "butter chicken" -> { System.out.println("Price: 320"); total += 320; }
                        case "chicken curry" -> { System.out.println("Price: 280"); total += 280; }
                        case "kadai chicken" -> { System.out.println("Price: 340"); total += 340; }
                        case "chicken tikka masala" -> { System.out.println("Price: 350"); total += 350; }
                        case "mutton curry" -> { System.out.println("Price: 420"); total += 420; }
                        case "mutton rogan josh" -> { System.out.println("Price: 450"); total += 450; }
                        case "mutton masala" -> { System.out.println("Price: 440"); total += 440; }
                        case "fish curry" -> { System.out.println("Price: 380"); total += 380; }
                        case "apollo fish curry" -> { System.out.println("Price: 420"); total += 420; }
                        case "prawn curry" -> { System.out.println("Price: 450"); total += 450; }
                        case "prawn masala" -> { System.out.println("Price: 480"); total += 480; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Dessert:");
                    String dessert = sc.nextLine().toLowerCase();

                    switch (dessert) {
                        case "gulab jamun" -> { System.out.println("Price: 80"); total += 80; }
                        case "rasmalai" -> { System.out.println("Price: 120"); total += 120; }
                        case "ice cream" -> { System.out.println("Price: 100"); total += 100; }
                        case "vanilla ice cream" -> { System.out.println("Price: 90"); total += 90; }
                        case "chocolate ice cream" -> { System.out.println("Price: 110"); total += 110; }
                        case "butterscotch ice cream" -> { System.out.println("Price: 110"); total += 110; }
                        case "kheer" -> { System.out.println("Price: 70"); total += 70; }
                        case "jalebi" -> { System.out.println("Price: 90"); total += 90; }
                        case "rabri" -> { System.out.println("Price: 130"); total += 130; }
                        case "brownie with ice cream" -> { System.out.println("Price: 180"); total += 180; }
                        default -> System.out.println("Item not found");
                    }
                }

                case "veg" -> {

                    System.out.println("Enter Veg Biryani:");
                    sc.nextLine();
                    String vegbiryani = sc.nextLine().toLowerCase();

                    switch (vegbiryani) {
                        case "veg biryani" -> { System.out.println("Price: 180"); total += 180; }
                        case "paneer biryani" -> { System.out.println("Price: 230"); total += 230; }
                        case "mushroom biryani" -> { System.out.println("Price: 220"); total += 220; }
                        case "veg dum biryani" -> { System.out.println("Price: 200"); total += 200; }
                        case "kaju biryani" -> { System.out.println("Price: 260"); total += 260; }
                        case "paneer tikka biryani" -> { System.out.println("Price: 250"); total += 250; }
                        case "hyderabadi veg biryani" -> { System.out.println("Price: 210"); total += 210; }
                        case "mixed vegetable biryani" -> { System.out.println("Price: 190"); total += 190; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Veg Starter:");
                    String vegstarters = sc.nextLine().toLowerCase();

                    switch (vegstarters) {
                        case "paneer tikka" -> { System.out.println("Price: 249"); total += 249; }
                        case "paneer 65" -> { System.out.println("Price: 239"); total += 239; }
                        case "gobi manchurian" -> { System.out.println("Price: 199"); total += 199; }
                        case "veg manchurian" -> { System.out.println("Price: 209"); total += 209; }
                        case "crispy corn" -> { System.out.println("Price: 189"); total += 189; }
                        case "hara bhara kabab" -> { System.out.println("Price: 219"); total += 219; }
                        case "mushroom 65" -> { System.out.println("Price: 229"); total += 229; }
                        case "aloo tikki" -> { System.out.println("Price: 179"); total += 179; }
                        case "spring rolls" -> { System.out.println("Price: 199"); total += 199; }
                        case "baby corn manchurian" -> { System.out.println("Price: 219"); total += 219; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Veg Curry:");
                    String vcurries = sc.nextLine().toLowerCase();

                    switch (vcurries) {
                        case "paneer butter masala" -> { System.out.println("Price: 280"); total += 280; }
                        case "kadai paneer" -> { System.out.println("Price: 270"); total += 270; }
                        case "paneer tikka masala" -> { System.out.println("Price: 290"); total += 290; }
                        case "shahi paneer" -> { System.out.println("Price: 300"); total += 300; }
                        case "palak paneer" -> { System.out.println("Price: 260"); total += 260; }
                        case "matar paneer" -> { System.out.println("Price: 250"); total += 250; }
                        case "veg kolhapuri" -> { System.out.println("Price: 240"); total += 240; }
                        case "veg kadai" -> { System.out.println("Price: 230"); total += 230; }
                        case "mix veg curry" -> { System.out.println("Price: 220"); total += 220; }
                        case "veg korma" -> { System.out.println("Price: 260"); total += 260; }
                        case "aloo gobi" -> { System.out.println("Price: 200"); total += 200; }
                        case "bhindi masala" -> { System.out.println("Price: 210"); total += 210; }
                        case "mushroom masala" -> { System.out.println("Price: 270"); total += 270; }
                        case "chana masala" -> { System.out.println("Price: 220"); total += 220; }
                        case "dal tadka" -> { System.out.println("Price: 180"); total += 180; }
                        case "dal makhani" -> { System.out.println("Price: 240"); total += 240; }
                        default -> System.out.println("Item not found");
                    }

                    System.out.println("Enter Dessert:");
                    String dessert = sc.nextLine().toLowerCase();

                    switch (dessert) {
                        case "gulab jamun" -> { System.out.println("Price: 80"); total += 80; }
                        case "rasmalai" -> { System.out.println("Price: 120"); total += 120; }
                        case "ice cream" -> { System.out.println("Price: 100"); total += 100; }
                        case "jalebi" -> { System.out.println("Price: 90"); total += 90; }
                        case "kheer" -> { System.out.println("Price: 70"); total += 70; }
                        case "brownie with ice cream" -> { System.out.println("Price: 180"); total += 180; }
                        case "rabri" -> { System.out.println("Price: 130"); total += 130; }
                        default -> System.out.println("Item not found");
                    }
                }

                default -> System.out.println("Invalid Category");
            }

            System.out.println("Do you want to order more? (yes/no)");
            choice = sc.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("================================");
        System.out.println("Total Bill: " + total);
        System.out.println("Thank you!");
        sc.close();
    }
}