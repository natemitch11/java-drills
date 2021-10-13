package starwars;

public class CharacterProfile {
    public static void main(String[] args){
        ConditionalLove love = new ConditionalLove();
        Shopping shopping = new Shopping();

        shopping.setPurse(150f);
        shopping.shopping();

        love.chooseLightsaber("black", "purple");
        love.catchARide("millennium falcon");
        love.buyFoodItem("Womp Rat", 4);
        love.buyFoodItem("Rancor", 100);
        love.buyDrink("Jawa Juice", 1.99f, 36);
        love.buyDrink("Blue Milk", 1.99f, 22);
        love.buyDrink("Green Milk", 0.99f, 22);

        Character quiGon = new Character(firstName, lastName, birthYearBBY, homeWorld, heightInMeters, weightInKg);
        System.out.printf("%s %s, was born %sBBY on the planet %s.%n", quiGon.firstName, quiGon.lastName,
                quiGon.birthYear, quiGon.homeWorld);
    }

    //Character Fields
    private static final String firstName = "Qui-Gon";
    private static final String lastName = "Jinn";
    private static final int birthYearBBY = 80;
    private static final String homeWorld = "Coruscant";
    private static final float heightInMeters = 1.93f;
    private static final int weightInKg = 85;

    private static class Character{
        String firstName;
        String lastName;
        int birthYear;
        String homeWorld;
        float heightInMeters;
        int weightInKg;

        public Character(String firstName, String lastName, int birthYear, String homeWorld, float heightInMeters,
                                             int weightInKg)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
            this.homeWorld = homeWorld;
            this.heightInMeters = heightInMeters;
            this.weightInKg = weightInKg;
        }
    }





}
