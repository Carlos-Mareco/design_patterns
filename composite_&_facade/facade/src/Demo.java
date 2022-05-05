public class Demo {
    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient();

        Food pasta = new Pasta();
        String pastaItems = ingredient.getPastaItems();
        pasta.prepareFood(pastaItems);
        System.out.println(pasta.deliveryFood());

        Food pizza = new Pizza();
        String pizzaItems = ingredient.getPizzaItems();
        pizza.prepareFood(pizzaItems);
        System.out.println(pizza.deliveryFood());
    }
}
