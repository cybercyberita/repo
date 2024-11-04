public class ManagementCompany {

    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    private String companyName;
    private String taxID;
    private double mgmFeePer;
    private Plot companyPlot;
    private Property[] properties;
    private int size;
    
    public ManagementCompany() 
    {
        this.companyName = "";
        this.taxID = "";
        this.mgmFeePer = 0.0;
        this.companyPlot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String companyName, String taxID, double mgmFee) 
    {
        this.companyName = companyName;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        this.companyPlot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String companyName, String taxID, double mgmFee, int x, int y, int width, int depth) 
    {
        this.companyName = companyName;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        this.companyPlot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(ManagementCompany otherCompany) 
    {
        this.companyName = otherCompany.companyName;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.companyPlot = new Plot(otherCompany.companyPlot);
        this.properties = new Property[MAX_PROPERTY];
        for (int i = 0; i < otherCompany.properties.length; i++) 
        {
            if (otherCompany.properties[i] != null)
                this.properties[i] = new Property(otherCompany.properties[i]);
        }
    }

    public int addProperty(String companyName, String city, double rent, String owner) 
    {
        Property newProperty = new Property(companyName, city, rent, owner);
        if(size == MAX_PROPERTY) return -1;
        if( !companyPlot.encompasses(newProperty.getPlot()) ) return -3;
        for(Property p : properties)
        {
            if( p != null && (p.getPlot()).overlaps(newProperty.getPlot()) ) return -4;
        }
        properties[size] = newProperty;
        return size++;
    }
    
    public int addProperty(String companyName, String city, double rent, String owner, int x, int y, int width, int depth) 
    {
        Property newProperty = new Property(companyName, city, rent, owner, x, y, width, depth);
        if(size == MAX_PROPERTY) return -1;
        if( !companyPlot.encompasses(newProperty.getPlot()) ) return -3;
        for(Property p : properties)
        {
            if( p != null && (p.getPlot()).overlaps(newProperty.getPlot()) ) return -4;
        }
        properties[size] = newProperty;
        return size++;
    }
    
    public int addProperty(Property newProperty) 
    {
        if(size == MAX_PROPERTY) return -1;
        if(newProperty == null) return -2;
        if( !companyPlot.encompasses(newProperty.getPlot()) ) return -3;
        for(Property p : properties)
        {
            if( p != null && (p.getPlot()).overlaps(newProperty.getPlot()) ) return -4;
        }
        properties[size] = newProperty;
        return size++;
    }
    
    public void removeLastProperty() 
    {
        properties[--size] = null;
    }

    public boolean isPropertiesFull() 
    {
        return properties[properties.length - 1] != null;
    }
    
    public int getPropertiesCount() 
    {
        return size;
    }
    
    public double getTotalRent() 
    {
        int total = 0;
        for(Property p : properties)
        {
            if( p != null ) total += p.getRentAmount();
        }
        return total;
    }
    
    public Property getHighestRentProperty() 
    {
        Property highest = null;
        for(Property p : properties)
            if(p != null && highest.getRentAmount() < p.getRentAmount()) highest = p;
        return highest;
    }
    
    public boolean isManagementFeeValid() 
    {
        if(0 <= mgmFeePer && 100 >= mgmFeePer)
            return true;
        else
            return false;
    }
    
    public String getName() 
    { return companyName; }
    
    public String getTaxID() 
    { return taxID; }

    public double getMgmFeePer() 
    { return mgmFeePer; }
    
    public Plot getPlot() 
    { return companyPlot; }
    
    public Property[] getProperties() 
    {
        Property[] copy = new Property[MAX_PROPERTY];

        int index = 0;
        for(Property p : properties)
        {
            if(p != null)
            {
                copy[index] = new Property(p); // copy
                index++;    
            }
        }
        return properties;
    }
    
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for " + companyName + ", taxID: " + taxID + "\n");
        sb.append("______________________________________________________\n");

        double totalFee = 0;
        for (Property property : properties) {
            if (property != null) 
            {
                sb.append(property.toString() + "\n");
                totalFee += property.getRentAmount() * (mgmFeePer / 100);
            }
        }

        sb.append("______________________________________________________\n\n");
        sb.append(" total management Fee: ").append(String.format("%.2f", totalFee));
        return sb.toString();
    }
}
