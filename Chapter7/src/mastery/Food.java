
/*

Program: Food.java        Last Date of this Revision: December 2, 2025

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french
fries, and sodas and then displays the total for the order. The LunchOrder application should include
a Food object with a constructor that accepts the price, fat, carbs, and fiber for an item. Food methods
should return the price of the item and return the fat, carbohydrates, and fiber.

Author: The student
School: CHHS
Course: Computer Science 20
 

*/




package mastery;

//Food.java
public class Food {
 private double price;
 private double fat;
 private double carbs;
 private double fiber;

 /** * Constructor that accepts the price, fat, carbs, and fiber for an item.
  */
 public Food(double p, double f, double c, double fi) {
     price = p;
     fat = f;
     carbs = c;
     fiber = fi;
 }

 // Food methods should return the price of the item and return the fat, carbohydrates, and fiber.
 public double getPrice() { return price; }
 public double getFat() { return fat; }
 public double getCarbs() { return carbs; }
 public double getFiber() { return fiber; }
}


/*
Enter number of hamburgers: 1
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads: 2
Each salad has 2.0g of fat, 22.0g of carbs, and 10.0g of fiber.
Enter number of fries: 3
French fries has 33.0g of fat, 108.0g of carbs, and 12.0g of fiber.
Enter number of sodas: 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.

Your order comes to: $10.70
*/