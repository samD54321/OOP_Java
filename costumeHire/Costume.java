package costumeHire;

import java.math.BigDecimal;

public class Costume {
	private String id;
	private String characterName;
	private int size;
	private boolean hiredState = false;
	private double hireFee;
	
	public final static int PRESCHOOL = 1;
	public final static int CHILD = 2;
	public final static int TWEEN = 3;
	public final static int TEEN = 4;
	public final static int ADULT = 5;
	
	
	public boolean isHired()
	{
		return hiredState;
	}
	
	public void hire()
	{
		hiredState = true;
	}
	
	public void endHire()
	{
		hiredState = false;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	
	public String getCharacterName()
	{
		return characterName;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setHireFee (double fee)
	{
		hireFee = fee;
	}
	
	public double getHireFee()
	{
		return hireFee;
	}
	
	public String toString()
	{
		String availability;
		if (hiredState)
			availability = "Unavailable - on loan";
		else
			availability = "Available for hire";
		
		String sizeInWords;

		switch (size) {
			case 1: sizeInWords = "PRESCHOOL";
					break;
			case 2: sizeInWords = "CHILD";
					break;
			case 3: sizeInWords = "TWEEN";
					break;
			case 4: sizeInWords = "TEEN";
					break;
			case 5: sizeInWords = "ADULT";
					break;
			default: sizeInWords = "Not registered";	
		}

		//TODO: analyze the use of PRESCHOOOL = 1 CHILD = 2 TWEEN =3....
			
		return String.format("Costume %s: %s SIZE %s. Hire fee $%.2f/day. Status: %s", id, characterName, sizeInWords, hireFee, availability);
	}
}
