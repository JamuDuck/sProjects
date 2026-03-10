public class Calc {
    //variables
    private double num1;
    private double num2;

    //constructor
    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    //setter for num1 & 2
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //getter for num1 & 2
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }

    //method to add the two numbers
    public double add() {
        return num1 + num2;
    }

    //method to subtract num2 from num1
    public double subtract() {
        return num1 - num2;
    }

    //method to multiply the two numbers
    public double multiply() {
        return num1 * num2;
    }

    //method to divide num1 by num2
    public double divide() {
        return num1 / num2;
    }

    //toString method - displays the data entries
    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }
}