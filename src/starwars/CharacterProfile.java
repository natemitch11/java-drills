package starwars;

public class CharacterProfile {
    private String firstName = "Qui-Gon";
    private String lastName = "Jinn";
    private int birthYearBBY = 80;
    private String homeWorld = "Coruscant";
    private float heightInMeters = 1.93f;
    private int weightInKg = 85;

    public static void main(String[] args){
        //System.out.printf("Hello There! My name is %s %s. I was born in the year %s BBY.");
        Shopping shopping = new Shopping();
        shopping.setPurse(150f);
        shopping.getPurse();
        shopping.shopping();
    }
}
