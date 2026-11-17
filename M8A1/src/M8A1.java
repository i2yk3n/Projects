import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M8A1{
    public static void main(String[] args) {
        //Set input and outpit files
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        //attempt to open and read file
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            reader.readLine();
            //create format headers if not persent
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();
            String line;
            //while data is not null assign data from columns to correct variables
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                int empID = Integer.parseInt(data[0]);
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);
                double weeklyPay;
                //calculate overtime pay
                if (hoursWorked > 40){
                    weeklyPay = (40 * payRate) +((hoursWorked - 40) * payRate * 1.5);
                }else{
                    weeklyPay = hoursWorked * payRate;
                }
                //format for weekly pay
                String formatwpay= String.format("$%.2f", weeklyPay);
                //output format
                String outputLine = empID + "," +payRate + "," +hoursWorked + "," +formatwpay;
                writer.write(outputLine);
                writer.newLine();
            }
            System.out.println("Payroll data successfully processed.");
        }
        catch (IOException e){
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
