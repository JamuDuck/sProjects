import java.util.Scanner;
public class Runner0 {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();

        //get user input for two numbers
        Scanner scan = new Scanner(System.in);

        //get first number + keep asking until valid input
        double n1 = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter the first number: ");
            if (scan.hasNextDouble()) {
                n1 = scan.nextDouble();
                validInput = true;
            }
            else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next(); //clear the invalid input
            }
        }

        //get second number
        double n2 = 0;
        validInput = false;
        while (!validInput) {
            System.out.println("Please enter the second number: ");
            if (scan.hasNextDouble()) {
                n2 = scan.nextDouble();
                validInput = true;
            }
            else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next(); //clear the invalid input
            }
        }

        //pass the numbers to Calc
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc
        System.out.println(myCalculator);

        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //Display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}