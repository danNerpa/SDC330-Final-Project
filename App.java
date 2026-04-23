/*
* Name: Dan D
* Date: 4/23/2026
* Assingment: SDC330 Final Project
*
* Main application class
*/

public class App {
    public static void main(String[] args) throws Exception {
        //Header line
        System.out.println("Dan D, SDC330 Final Project\n");

        //Instantiate 3 Customer Objects
        Customer c1 = new Customer(1, "Alice Smith", "555-1234", "alice.smith@email.com");
        Customer c2 = new Customer(2, "Bob Johnson", "555-5678", "bob.johnson@email.com");
        Customer c3 = new Customer(3, "Charlie Brown", "555-9012", "charlie.brown@email.com");

        //Create some menu items to add to orders
        Protein chicken = new Protein("Chicken Breast", 5.99, 200, "Grilled chicken breast", "None");
        Protein beef = new Protein("Beef Steak", 9.99, 400, "Juicy beef steak", "None");
        Protein tofu = new Protein("Tofu", 4.99, 150, "Marinated tofu", "Soy");
        Vegetable broccoli = new Vegetable("Broccoli", 2.99, 50, "Steamed broccoli", "None");
        Vegetable carrots = new Vegetable("Carrots", 1.99, 30, "Glazed carrots", "None");

        //Instantiate 3 Order objects
        Order o1 = new Order(101, c1);
        Order o2 = new Order(102, c2);
        Order o3 = new Order(103, c3);

        //Add menu items to orders
        o1.addFood(chicken);
        o1.addFood(broccoli);
        o2.addFood(beef);
        o2.addFood(carrots);
        o3.addFood(tofu);
        o3.addFood(broccoli);

        //Print out orders to console
        System.out.print(o1);
        System.out.print(o2);
        System.out.print(o3);
    }
}
