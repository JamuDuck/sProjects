import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class M8A1 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        DecimalFormat currencyFormat = new DecimalFormat("$0.00");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String headerLine = reader.readLine();

            writer.write("EmpID,Rate,Hours,Weekly Pay");
            writer.newLine();

            // Read each line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                // Extract data
                String empID = fields[0];
                String rateStr = fields[1];
                String hoursStr = fields[2];

                double payRate = Double.parseDouble(rateStr);
                double hoursWorked = Double.parseDouble(hoursStr);

                // Calculate weekly pay with overtime
                double weeklyPay;
                if (hoursWorked <= 40) {
                    // No overtime
                    weeklyPay = payRate * hoursWorked;
                } else {
                    // Calc Pay
                    double regularPay = payRate * 40;
                    double overtimeHours = hoursWorked - 40;
                    double overtimePay = payRate * 1.5 * overtimeHours;
                    weeklyPay = regularPay + overtimePay;
                }

                // Format weekly pay
                String formattedPay = currencyFormat.format(weeklyPay);
                String outputLine = empID + "," + rateStr + "," + hoursStr + "," + formattedPay;

                // Write the line to output file
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Data has been read from " + inputFile);
            System.out.println("Results have been written to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
            e.printStackTrace();
        }
    }
}