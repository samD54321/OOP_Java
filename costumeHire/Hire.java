package costumeHire;

import java.time.*;

public class Hire {
	protected int hireID;
	protected String startDate;
	protected String endDate;
	protected int daysHired;
	protected double hireFee;
	protected Customer client;
	protected boolean hireInProgress = false;
	protected static int hireCounter = 1;
	
	public Hire() {
		ZoneId zoneId = ZoneId.of("Australia/Sydney");
		startDate = LocalDate.now(zoneId).toString();
		hireInProgress = true;
		hireID = hireCounter;
		hireCounter += 1;
	}
	
	public int getHireID()
	{
		return hireID;
	}
	
	public void endHire(int hireIndex)
	{
		hireInProgress = false;
		ZoneId zoneId = ZoneId.of("Australia/Sydney");  
		
		endDate = LocalDate.now(zoneId).toString();
		
	}
	
	public Customer getCustomer() {
		return this.client;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String toString() {
		String hireState;
		if (hireInProgress)
			hireState = "On Loan";
		else
			hireState = "Hire Completed";
		
		return String.format("Hire Ref#: %d.\t%s.\tCostume %s: %s \tHire commenced: %s\tHire completed: %s.\tTotal: %d days for $%.2f.\tStatus: %s", hireID, client.toString(),  startDate, endDate, daysHired, hireFee, hireState);
	}
}

