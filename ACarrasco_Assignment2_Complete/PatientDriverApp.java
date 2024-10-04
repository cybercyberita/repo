/*
 * Class: CMSC203
 * Instructor: David Kuijt
 * Description: Patient class which holds all prominent information regarding client
 * Due: 10/06/2024
 * Platform/compiler: Visual Studio Code
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Adrian Carrasco
*/
import java.util.Scanner;
public class PatientDriverApp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Patient currentPatient = getPatientAttributes(sc);

        // no arg procedure
        Procedure procedure1 = new Procedure(); 
        procedure1.setProcedureName("X-Ray");
        procedure1.setProcedureDate("10/01/2024");
        procedure1.setPractitionerName("Dr. Smith");
        procedure1.setProcedureCharges(500.00);

        // procedure - name and date
        Procedure procedure2 = new Procedure("Blood Test", "10/02/2024"); 
        procedure2.setPractitionerName("Dr. Johnson");
        procedure2.setProcedureCharges(200.00);

        // procedure - all attributes
        Procedure procedure3 = new Procedure("MRI", "10/03/2024", "Dr. Lee", 1000.00);

        System.out.println();
        displayPatient(currentPatient);

        
        System.out.println("\n Procedures:");
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + String.format("%,.2f", totalCharges));

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("MC#: ");
        String description = sc.nextLine();
        System.out.println("Due Date: ");
        String dueDate = sc.nextLine();

        System.out.println("User Name: " + name);
        System.out.println("MC#: " + description);
        System.out.println("Due Date: " + dueDate);
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Patient info:\n" + patient.toString());
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString() + "\n");
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getProcedureCharges() + p2.getProcedureCharges() + p3.getProcedureCharges();
    }

    public static Patient getPatientAttributes(Scanner sc) 
    {
        System.out.println("Enter patient first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter patient middle name: ");
        String middleName = sc.nextLine();
        System.out.println("Enter patient last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter street address: ");
        String streetAddress = sc.nextLine();
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        System.out.println("Enter state: ");
        String state = sc.nextLine();
        System.out.println("Enter ZIP code: ");
        String zip = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter emergency contact name: ");
        String emergencyContactName = sc.nextLine();
        System.out.println("Enter emergency contact phone number: ");
        String emergencyContactPhone = sc.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phoneNumber, emergencyContactName, emergencyContactPhone);
        
        return patient;
    }
}
