package starwars;
import java.util.Random;

public class ConditionalLove {
    private final Random rand = new Random();
    private static class Food{
        String name;
        int price;
        boolean recommended;
    }
    private Object createFood(String name, int price){
        Food food = new Food();
        food.name = name;
        food.price = price;
        food.recommended = rand.nextBoolean();
        return food;
    }
    private static class Drink{
        String name;
        float price;
        int sizeInOz;
    }
    private Object createDrink(String name, float price, int size){
        Drink drink = new Drink();
        drink.name = name;
        drink.price = price;
        drink.sizeInOz = size;
        return drink;
    }

    public void chooseLightsaber(String handle, String color){
        if (handle.equalsIgnoreCase("black") && color.equalsIgnoreCase("purple") ){
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass");
        }
    }
    public void catchARide (String shipname){
        if (shipname.equalsIgnoreCase("Millennium Falcon")){
            System.out.println("Let's Go!");
        } else {
            System.out.println("I better hide somewhere!");
        }
    }
    public void buyFoodItem (String item, int price){
        Object food = createFood(item, price);
        int foodPrice = ((Food) food).price;
        boolean foodRec = ((Food) food).recommended;

        if (foodPrice < 5 && foodRec == true){
            System.out.printf("I think I'll try this %s!%n", item);
        } else {
            System.out.printf("I think I'll pass on eating %s%n", item);
        }
    }
    public void buyDrink (String name, float price, int size){
        Object drink = createDrink(name, price, size);
        float drinkPrice = ((Drink) drink).price;
        int drinkSize = ((Drink) drink).sizeInOz;

        if ( drinkPrice < 1 || drinkSize > 24){
            System.out.printf("I think I'll buy this %s!%n", name);
        } else {
            System.out.println("Nah, I'll just finish this drink");
        }
    }
}
