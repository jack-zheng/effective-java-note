package effective.hierarchies;


public class Client {

    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(NYPizza.Size.LARGE).addTopping(Pizza.Topping.ONION).addTopping(Pizza.Topping.HAM).build();
        System.out.println(nyPizza);

        Calzone calzone = new Calzone.Builder().sauceInside().addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.SAUSAGE).build();
        System.out.println(calzone);
    }
}
