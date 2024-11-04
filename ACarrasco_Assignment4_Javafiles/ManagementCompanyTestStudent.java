
/**
 * This class represents GFA test cases for a ManagementCompany object.
 * 
 * @author Farnaz Eivazi
 * @version 7/12/2022
 * 
 */
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	Property property1;
	Property property2;
	Property property3;
	ManagementCompany mangementCo ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Carrasco", "787848551",3);
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	public void testAddProperty() {
		property1 = new Property ("Pike", "Rockville", 2200, "Kevin Miller",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(property1),0,0);
		property2 = new Property ("Shirt", "Texas", 2200, "Juan Manuel",4,5,2,3);		 
		assertEquals(mangementCo.addProperty(property2),1,0);
		property2 = new Property ("Dove", "Wheaton", 2200, "Samuel Tiller",5, 4,2,3);		// overlaps 
		assertEquals(mangementCo.addProperty(property2),-4,0);
	}
	
	@Test
	public void testGetPropertiesCount() {
		property1 = new Property ("Pike", "Rockville", 2200, "Kevin Miller",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(property1),0,0);	
		assertEquals(mangementCo.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		property1 = new Property ("Pike", "Rockville", 2200.0, "Kevin Miller",2,5,2,2);
		assertEquals(mangementCo.addProperty(property1), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Carrasco, taxID: 787848551\n"
				+ "______________________________________________________\n"
				+ "Pike,Rockville,Kevin Miller,2200.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 66.00";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
				
	}

}
