package starwars;

public class Shopping {
    private float purse;

    public float setPurse(float num){
        return this.purse = num;
    }
    public void getPurse(){
        System.out.println(this.purse);
    }
    public void shopping() {
    float funds = this.purse;
    System.out.printf("You begin your shopping spree with %s credits.%n%n", funds);
    funds = purchaseDroid(funds);
    funds = purchaseBoots(funds);
    funds = gambleWithJedi(funds);
    funds = purchaseLightsaber(funds);
    System.out.printf("%nYou finished your shopping spree with %s credits!%n", funds);
    }
    private static float purchaseDroid(float funds){
        funds -= 24.3f;
        System.out.println("You purchased a droid for 24.3 credits");
        return funds;
    }
    private static float purchaseBoots(float funds){
        funds -= 45f;
        System.out.println("You purchased a fine set of boots for 45 credits");
        return funds;
    }
    private static float gambleWithJedi(float funds){
        funds *= 2f;
        System.out.printf("You gambled with some Jedi and doubled your credits to %s credits!%n", funds);
        return funds;
    }
    private static float purchaseLightsaber(float funds){
        float cost = funds / 10;
        funds -= cost;
        System.out.printf("You purchased a rare lightsaber for %s credits%n", cost);
        return funds;
    }
}
