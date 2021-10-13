package functions;

import java.util.Arrays;

public class FunctionDrills {
    public static void main(String[] args){
        helloWorld();
        greeting("Nate");
        System.out.println(add(5,7));
        faveColorFinder("green");
        thatsOdd(9);
        bigOrSmall(array);
    }

    public static void helloWorld (){
        System.out.println("Howdy Y'all!");
    }
    public static void greeting(String name){
        System.out.printf("Hello %s!%n", name);
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static void faveColorFinder(String color){
        if (color.equalsIgnoreCase("red")){
            System.out.println("Red is a great color!");
        } else if (color.equalsIgnoreCase("green")){
            System.out.println("Green is a solid favorite color.");
        } else if (color.equalsIgnoreCase("black")){
            System.out.println("OOOHHHH SO TRENDY");
        } else{
            System.out.println("You really need to evaluate your favorite color");
        }
    }
    public static void thatsOdd(int num){
        String s = num % 2 == 0 ? "That's even" : "That's odd";
        System.out.println(s);
    }
    private static final int[] array = {1,5,8,7,6,78,3,4,5,56,150,200,45,1000};
    public static void bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100){
                answers[i]= "BIG";
            } else {
                answers[i] = "small";
            }
        }
        System.out.println(Arrays.toString(answers));
    }
}
