package snackBar;

public class Main
{

    public static void main(String[] args)
    {
        //instantiate customer
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //instantiate vending machine
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("office");

        //instanitiate snacks
        //food
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("ChocolateBar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        //instantiate snacks
        //drinks
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        //processing
        // 1 - Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        jane.buySnack(soda.getTotalCost(4));
        soda.buySnack(4);
        System.out.println("Customer 1 cash on hand: " + jane.getCash());
        System.out.println("Quantity of snack 4: " + soda.getQuantity());

        // 2 - Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        jane.buySnack(pretzel.getTotalCost(1));
        pretzel.buySnack(1);
        System.out.println("Customer 1 cash on hand: " + jane.getCash());
        System.out.println("Quantity of snack 3: " + pretzel.getQuantity());


        // 3 - Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        bob.buySnack(soda.getTotalCost(2));
        soda.buySnack(2);
        System.out.println("Customer 2 cash on hand: " + bob.getCash());
        System.out.println("Quantity of snack 4: " + soda.getQuantity());

        // 4 - Customer 1 finds $10. Print Customer 1 Cash on Hand.
        jane.addCash(10.00);
        System.out.println("Customer 1 cash on hand: " + jane.getCash());

        // 5 - Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        jane.buySnack(chocolateBar.getTotalCost(2));
        chocolateBar.buySnack(2);
        System.out.println("Customer 1 cash on hand: " + jane.getCash());
        System.out.println("Quantity of snack 2: " + chocolateBar.getQuantity());

        // 6 - Add 12 more items to snack 3. Print quantity of snack 3.
        pretzel.addQuantity(12);
        System.out.println("Quantity of snack 3: " + pretzel.getQuantity());

        // 7 - Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        bob.buySnack(pretzel.getTotalCost(3));
        pretzel.buySnack(3);
        System.out.println("Customer 2 cash on hand: " + bob.getCash());
        System.out.println("Quantity of snack 3: " + pretzel.getQuantity());

        // stretch - display each snack with name, vending machine name, quantity, and total cost of all quantities of this snack on hand
        System.out.println(chips.toString());
        System.out.println(chocolateBar.toString());
        System.out.println(pretzel.toString());
        System.out.println(soda.toString());
        System.out.println(water.toString());

    }

}