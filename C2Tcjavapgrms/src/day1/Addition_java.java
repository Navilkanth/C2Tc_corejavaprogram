package day1;

public class Addition_java {
    public static void main(String[] args) {
       
        if (args.length < 2) {
            System.out.println("Error: Please provide two numbers as arguments.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]); 
            int b = Integer.parseInt(args[1]);
            int c = a + b; 

            System.out.println("Addition of a=" + a + " and b=" + b + " is " + c);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        }
    }
}
