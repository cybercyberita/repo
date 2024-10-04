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

public class Patient 
{
    private String firstName, middleName, lastName;
    private String streetAddress, city, state, zip;
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;

    public Patient() 
    {
        firstName = middleName = lastName = "";
        streetAddress = city = state = zip = "";
        phoneNumber = "";
        emergencyContactName = emergencyContactPhone = "";
    }

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        streetAddress = city = state = zip = "";
        phoneNumber = "";
        emergencyContactName = emergencyContactPhone = "";

    }

    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zip, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // first name setter and getter
    public String getFirstName() 
    { return firstName; }
    public void setFirstName(String firstName) 
    { this.firstName = firstName; }

    // middle name setter and getter
    public String getMiddleName() 
    { return middleName; }
    public void setMiddleName(String middleName) 
    { this.middleName = middleName; }

    // last name setter and getter
    public String getLastName() 
    { return lastName; }
    public void setLastName(String lastName) 
    { this.lastName = lastName; }

    // street address setter and getter
    public String getStreetAddress() 
    { return streetAddress; }
    public void setStreetAddress(String streetAddress) 
    { this.streetAddress = streetAddress; }

    // city setter and getter
    public String getCity() 
    { return city; }
    public void setCity(String city) 
    { this.city = city; }

    // state setter and getter
    public String getState() 
    { return state; }
    public void setState(String state) 
    { this.state = state; }

    // zip code setter and getter
    public String getZip() 
    { return zip; }
    public void setZip(String zip) 
    { this.zip = zip; }

    // phone number setter and getter
    public String getPhoneNumber() 
    { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) 
    { this.phoneNumber = phoneNumber; }

    // emergancy contact name setter and getter
    public String getEmergencyContactName() 
    { return emergencyContactName; }
    public void setEmergencyContactName(String emergencyContactName) 
    { this.emergencyContactName = emergencyContactName; }

    // emergency contact phone # setter and getter
    public String getEmergencyContactPhone() 
    { return emergencyContactPhone; }
    public void setEmergencyContactPhone(String emergencyContactPhone) 
    { this.emergencyContactPhone = emergencyContactPhone; }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zip;
    }
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append(" Name: " + buildFullName());
        sb.append("\n Address: " + buildAddress());
        sb.append("\n Emergency Contact: " + buildEmergencyContact());

        return sb.toString();
    }
}
