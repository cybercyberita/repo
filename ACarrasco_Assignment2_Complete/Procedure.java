/*
 * Class: CMSC203
 * Instructor: David Kuijt
 * Description: Procedure class which holds all the instance's name, date, practitioner and cost 
 * Due: 10/06/2024
 * Platform/compiler: Visual Studio Code
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Adrian Carrasco
*/
public class Procedure 
{
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    public Procedure() 
    {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharges = 0.0;
    }

    public Procedure(String procedureName, String procedureDate) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    public String getProcedureName() 
    { return procedureName; }
    public void setProcedureName(String procedureName) 
    { this.procedureName = procedureName; }

    public String getProcedureDate() 
    { return procedureDate; }
    public void setProcedureDate(String procedureDate) 
    { this.procedureDate = procedureDate; }

    public String getPractitionerName() 
    { return practitionerName; }
    public void setPractitionerName(String practitionerName) 
    { this.practitionerName = practitionerName; }

    public double getProcedureCharges() {
         return procedureCharges; }
    public void setProcedureCharges(double procedureCharges) 
    { this.procedureCharges = procedureCharges; }

    // toString method to display procedure information
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\tProcedure: " + procedureName);
        sb.append("\n\tProcedure Date = " + procedureDate);
        sb.append("\n\tPractitioner = " + procedureName);
        sb.append("\n\tCost = " + procedureName);

        return sb.toString();
    }
}
