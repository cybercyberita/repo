public class Property 
{
    private String propertyName;
    private String city;
    private String owner;
    private double rentalAmt;
    private Plot plot;

    public Property() 
    {
        this.propertyName = "";
        this.city = "";
        this.rentalAmt = 0.0;
        this.owner = "";
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner) 
    {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmt = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) 
    {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmt = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(Property otherProperty) 
    {
        this.propertyName = otherProperty.getPropertyName();
        this.city = otherProperty.getCity();
        this.rentalAmt = otherProperty.getRentAmount();
        this.owner = otherProperty.getOwner();
        this.plot = new Plot(otherProperty.getPlot());
    }

    public Plot getPlot() { return plot; }

    public String getPropertyName() { return propertyName; }

    public String getCity() { return city; }

    public String getOwner() { return owner; }
    
    public double getRentAmount() { return rentalAmt; }
    
    public void setPropertyName(String propertyName) 
    { this.propertyName = propertyName; }

    public void setCity(String city) 
    { this.city = city; }

    public void setOwner(String owner) 
    { this.owner = owner; }

    public void setRentalAmt(double rentalAmt) 
    { this.rentalAmt = rentalAmt; }

    @Override
    public String toString() 
    {
        return String.format("%s,%s,%s,%.1f", propertyName, city, owner, rentalAmt);
    }
}
