package functions;

public class FizzBuzz {
    //Entry point for the program
    public static void main(String[] args) {
        //Calls the private method
        fizzBuzz100();
    }
    //initializes private method
    private static void fizzBuzz100() {
        //initializes for-loop
        for (int i = 1; i <= 100; i++) {
            //conditional logic
            if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }
}
